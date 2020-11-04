
/**
 * Write a description of class Demon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demon extends Creature
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Demon
     */
    public Demon()
    {
        // initialise instance variables
        super();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int attack(int str)
    {
        int percent = (Randomizer.nextInt(100) + 1);
        if(percent <= 5)
        {
            return (((Randomizer.nextInt(str) + 1) * 2) + 50);
        }
        else
        {
            return super.attack(str);
        }
    }
}
