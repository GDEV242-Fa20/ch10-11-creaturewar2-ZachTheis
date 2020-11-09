
/**
 * Sturdy and stalwart, dwarves have better health and strength than humans or elves. They also wear heavy armor, making
 * them resistant to all damage.
 *
 * @author Zach Theis
 * @version 11.9.2020
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
     * Because they wear heavy armor, Dwarves reduce all damage taken by 3, to a minimum of 0.
     *  
     * @param damage The damage dealt by the attacker
     * @return The reduced damage to be dealt to the Dwarf
     */
    public void takeDamage(int damage)
    {
        if(damage >= 3)
        {
            damage -= 3;
        }
        else if(damage <3)
        {
            damage = 0;
        } 
        super.takeDamage(damage);
    }
}
