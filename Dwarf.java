
/**
 * Write a description of class Dwarf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dwarf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_DWARF_HP = 30;
    private static final int MIN_DWARF_HP = 15;
    private static final int MAX_DWARF_STR = 20;
    private static final int MIN_DWARF_STR = 10;

    /**
     * Constructor for objects of class Dwarf
     */
    public Dwarf()
    {
        super
        (
            Randomizer.nextInt(MAX_DWARF_HP - MIN_DWARF_HP) + MIN_DWARF_HP,
            Randomizer.nextInt(MAX_DWARF_STR - MIN_DWARF_STR) + MIN_DWARF_STR
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
        if(damage >= 5)
        {
            damage -= 5;
        }
        else if(damage <5)
        {
            damage = 0;
        } 
        super.takeDamage(damage);
    }
}
