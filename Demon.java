
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
    public Demon(int str, int hp)
    {
        super(str, hp);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int attack(int str)
    {
        int percent = Randomizer.nextInt(100) + 1;
        int baseDamage = super.attack(str);
        if(percent <= 5)
        {
            baseDamage *= 2;
            baseDamage += 50;
        }
        return baseDamage;
    }
}
