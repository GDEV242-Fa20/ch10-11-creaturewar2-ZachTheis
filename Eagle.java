
/**
 * Write a description of class Eagle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Eagle extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_EAGLE_HP = 50;
    private static final int MIN_EAGLE_HP = 30;
    private static final int MAX_EAGLE_STR = 30;
    private static final int MIN_EAGLE_STR = 15;

    /**
     * Constructor for objects of class Eagle
     */
    public Eagle()
    {
        super
        (
            Randomizer.nextInt(MAX_EAGLE_HP - MIN_EAGLE_HP) + MIN_EAGLE_HP,
            Randomizer.nextInt(MAX_EAGLE_STR - MIN_EAGLE_STR) + MIN_EAGLE_STR
        );
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void takeDamage(int damage)
    {
        int percent = Randomizer.nextInt(100) + 1;
        if(percent > 5)
        {
            super.takeDamage(damage);
        }
    }
}
