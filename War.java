import java.util.ArrayList;
/**
 * This simulates an over-simplified battle between two armies. One is composed of Humans, Elves, Dwarves, and Eages,
 * the other of Humans, Cyber-Demons, and Balrogs,
 *
 * @author Zach Theis
 * @version 11.9.2020
 */
public class War
{
    // instance variables - replace the example below with your own
    private ArrayList<Creature> goodArmy;
    private ArrayList<Creature> evilArmy;

    /**
     * Constructor for objects of class War
     */
    public War()
    {
        goodArmy = new ArrayList<>();
        evilArmy = new ArrayList<>();
        
        createGoodArmy();
        createEvilArmy();
    }
    
    /**
     * Takes the two armies and pits them against each other in a series of duels. When a creature is reduced to 0 health,
     * It is knocked out and the next creature steps up. Once one army has no creatures left above 0 health, the battle
     * is over and reports are prepared.
     */
    public void fight()
    {
        int heroIndex = 0;
        int villainIndex = 0;
        boolean goodDefeated = false;
        boolean evilDefeated = false;
        while(goodArmy.size() > heroIndex && evilArmy.size() > villainIndex)
        {
            Creature hero = goodArmy.get(heroIndex);
            Creature villain = evilArmy.get(villainIndex);
            hero.takeDamage(villain.attack());
            villain.takeDamage(hero.attack());
            if(hero.isKnockedOut())
            {
                heroIndex++;
            }
            if(villain.isKnockedOut())
            {
                villainIndex++;
            }
            if(heroIndex == goodArmy.size())
            {
                goodDefeated = true;
            }
            if(villainIndex == evilArmy.size())
            {
                evilDefeated = true;
            }
        }
        System.out.println(victoryReport(goodDefeated, evilDefeated));
        System.out.println(casualtyReport(goodArmy, evilArmy));
    }

    /**
     * This creates a randomized army of Humans, Elves, Dwarves, and Eagles. The army consists of exactly 100 creatures.
     */
    private ArrayList createGoodArmy()
    {
        int armySize = 100;
        while(goodArmy.size() < armySize)
        {
            int d12Roll = Randomizer.nextInt(12);
            if(d12Roll <= 3)
            {
                goodArmy.add(new Human());
            }
            else if(d12Roll <= 6)
            {
                goodArmy.add(new Elf());
            }
            else if(d12Roll <= 9)
            {
                goodArmy.add(new Dwarf());
            }
            else
            {
                goodArmy.add(new Eagle());
            }
        }
        
        return goodArmy;
    }
    
    /**
     * Creates a random army of Humans, Cyber-Demons, and Balrogs. The army consists of between 30 and 50 creatures,
     * determined randomly.
     */
    private ArrayList createEvilArmy()
    {
        int armySize = Randomizer.nextInt(21) + 30;
        while(evilArmy.size() < armySize)
        {
            int d25Roll = Randomizer.nextInt(25);
            if(d25Roll <= 17)
            {
                evilArmy.add(new Human());
            }
            else if(d25Roll <= 23)
            {
                evilArmy.add(new CyberDemon());
            }
            else
            {
                evilArmy.add(new Balrog());
            }
        }
        return evilArmy;
    }
    
    /**
     * This creates a report detailing which army won. It is possible for a tie to occur.
     * 
     * @param goodFell Whether or not the good army was defeated.
     * @param evilFell Whether or not the evil army was defeated.
     * @return The String containing the victory report.
     */
    private String victoryReport(boolean goodFell, boolean evilFell)
    {
        String reportString = "";
        
        if(goodFell && evilFell)
        {
            reportString += "In the end, neither army prevailed.";
        }
        else if(goodFell)
        {
            reportString += "In the end, evil prevailed.";
        }
        else
        {
            reportString += "In the end, good prevailed!";
        }
        return reportString;
    }
    
    /**
     * This prepares a report of the casualties suffered on each side, separated by race.
     * 
     * @param heroArmy The good army
     * @param villainArmy The evil army
     * @return The string containing the casualty report
     */
    private String casualtyReport(ArrayList heroArmy, ArrayList villainArmy)
    {
        String reportString = "";
        ArrayList<Creature> heroes = heroArmy;
        ArrayList<Creature> villains = villainArmy;
        int goodHumanLosses = 0;
        int elfLosses = 0;
        int dwarfLosses = 0;
        int eagleLosses = 0;
        int evilHumanLosses = 0;
        int cyberDemonLosses = 0;
        int balrogLosses = 0;
        
        for(Creature hero : heroes)
        {
            if(hero.isKnockedOut())
            {
                if(hero instanceof Human)
                {
                    goodHumanLosses++;
                }
                else if(hero instanceof Elf)
                {
                    elfLosses++;
                }
                else if(hero instanceof Dwarf)
                {
                    dwarfLosses++;
                }
                else if(hero instanceof Eagle)
                {
                    eagleLosses++;
                }
            }
        }
        for(Creature villain : villains)
        {
            if(villain.isKnockedOut())
            {
                if(villain instanceof Human)
                    {
                        evilHumanLosses++;
                    }
                else if(villain instanceof CyberDemon)
                    {
                        cyberDemonLosses++;
                    }
                else if(villain instanceof Balrog)
                    {
                        balrogLosses++;
                    }
            }
        }
        reportString = "The forces of light lost " + goodHumanLosses + " humans, " + elfLosses + " elves, " + dwarfLosses
            + " dwarves, and " + eagleLosses + "eagles.\nThe forces of darkness lost " + evilHumanLosses + " humans, " +
            cyberDemonLosses + " cyber-demons, and " + balrogLosses + " balrogs.\n";
        return reportString;
    }
}
