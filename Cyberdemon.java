
/**
 * Write a description of class Cyberdemon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CyberDemon extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_CYBERDEMON_HP = 100;
    private static final int MIN_CYBERDEMON_HP = 25;
    private static final int MAX_CYBERDEMON_STR = 40;
    private static final int MIN_CYBERDEMON_STR = 20;

    /**
     * Constructor for objects of class CyberDemon
     */
    public CyberDemon()
    {
        super
        (
            Randomizer.nextInt(MAX_CYBERDEMON_HP - MIN_CYBERDEMON_HP) + MIN_CYBERDEMON_HP,    
            Randomizer.nextInt(MAX_CYBERDEMON_STR - MIN_CYBERDEMON_STR) + MIN_CYBERDEMON_STR
        );
    }

}
