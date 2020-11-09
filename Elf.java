
/**
 * Graceful and ephemeral, elves are proud warriors of light.
 * Elves have the lowest health and strength (tied with Humans), but have a small chance to imbue their strikes with magic.
 *
 * @author Zach
 * @version 11.9.2020
 */
public class Elf extends Creature
{
    // instance variables - replace the example below with your own
    private static final int MAX_ELF_HP = 25;
    private static final int MIN_ELF_HP = 8;
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
     * Calculates the damage the elf will deal. There is a 10 percent chance that the Elf will deal magic damage, doubling
     * their damage output.
     *
     * @return The damage the Elf will deal.
     */
    public int attack()
    {
        int percent = Randomizer.nextInt(100) + 1;
        int baseDamage = super.attack();
        if(percent <= 10)
        {
            baseDamage *= 2;
        }
        return baseDamage;
    }
}
