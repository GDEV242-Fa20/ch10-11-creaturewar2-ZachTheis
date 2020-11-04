
/**
 * Write a description of class Elf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 5;
    private static final int MAX_ELF_STR = 18;
    private static final int MIN_ELF_STR = 5;

    /**
     * Constructor for objects of class Elf
     */
    public Elf()
    {
        super
        (
            Randomizer.nextInt(MAX_ELF_HP - MIN_ELF_HP) + MIN_ELF_HP,    
            Randomizer.nextInt(MAX_ELF_STR - MIN_ELF_STR) + MIN_ELF_STR
        );
        
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
        if(percent <= 10)
        {
            return (Randomizer.nextInt(str) + 1) * 2;
        }
        else
        {
            return super.attack(str);
        }
    }
}
