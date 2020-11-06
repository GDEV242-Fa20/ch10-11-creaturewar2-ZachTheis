import java.util.ArrayList;
/**
 * Write a description of class War here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
        victoryReport(goodDefeated, evilDefeated);
        casualtyReport(goodArmy, evilArmy);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
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
    
    private void victoryReport(boolean goodFell, boolean evilFell)
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
        System.out.println(reportString);
    }
    
    private void casualtyReport(ArrayList heroes, ArrayList villains)
    {
        
    }
}
