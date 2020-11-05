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
        ArrayList<Creature> goodArmy = new ArrayList<>();
        ArrayList<Creature> evilArmy = new ArrayList<>();
        
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
        while(armySize < goodArmy.size())
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
        while(armySize < evilArmy.size())
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
}
