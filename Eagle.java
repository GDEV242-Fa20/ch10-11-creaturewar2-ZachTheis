
/**
 * Majestic and free, though not very numerous, the Eagles have agreed to join the army of light.
 * Eagles have the highest strength and health among all light creatures. They also have a small chance to avoid an attack.
 *
 * @author Zach Theis
 * @version 11.9.2020
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
     * Unlike most creatures, Eagles can fly. There is a small chance that they Eagle can evade an enemy's attack altoether
     * flying out of reach.
     * This method has a 95% chance to function as per the normal takeDamage method. The remaining 5% of the time, the 
     * Eagle takes no damage.
     *
     * @param damage The incoming damage from the attack
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
