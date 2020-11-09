
/**
 * Cyber-Demons are mechanically (and anachronistically) enhanced demons. They serve as heavy troops in the dark army.
 * 
 * Cyber-Demons have high health and strength, but no special qualities beyond what all Demons possess.
 *
 * @author Zach Theis
 * @version 10.9.2020
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