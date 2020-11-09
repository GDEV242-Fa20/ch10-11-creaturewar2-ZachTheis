
/**
 * Demons are the heavy troops of the dark army. Imbued with unholy strength, they have a small change to deal truly
 * devastating damage.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Demon extends Creature
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class Demon.
     * This should never actually be run.
     */
    protected Demon(int str, int hp)
    {
        super(str, hp);
    }

    /**
     * All Demons have a 5% change to deal double damage + 50
     *
     * @return The damage to be dealt.
     */
    public int attack()
    {
        int percent = Randomizer.nextInt(100) + 1;
        int baseDamage = super.attack();
        if(percent <= 5)
        {
            baseDamage *= 2;
            baseDamage += 50;
        }
        return baseDamage;
    }
}
