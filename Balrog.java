
/**
 * Balrogs are demonic creatures of shadow and flame. Imprisoned deep below the earth, they were freed to serve in the 
 * dark army. Though few in number, they are terrifyingly strong and durable.
 * 
 * Balrogs have the highest health and strength of any creature. They also attack twice each round.
 *
 * @author Zach Theis
 * @version 11.9.2020
 */
public class Balrog extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_BALROG_HP = 200;
    private static final int MIN_BALROG_HP = 80;
    private static final int MAX_BALROG_STR = 100;
    private static final int MIN_BALROG_STR = 50;

    /**
     * Constructor for objects of class Balrog
     */
    public Balrog()
    {
        super
        (
            Randomizer.nextInt(MAX_BALROG_HP - MIN_BALROG_HP) + MIN_BALROG_HP,    
            Randomizer.nextInt(MAX_BALROG_STR - MIN_BALROG_STR) + MIN_BALROG_STR
        );
    }

    /**
     * Balrogs attack twice, calculating the damage for each separately, then adding them together for the total damage.
     *
     * @param str The Balrog's strength value.
     * @return The total damage dealt
     */
    public int attack()
    {
        int totalDamage = 0;
        for(int i = 0; i < 2; i++)
        {
            totalDamage += super.attack();
        }
        return totalDamage;
    }
}
