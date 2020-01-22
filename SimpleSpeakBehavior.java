/**
 * @author Hardik Anand
 * @email hanand@email.sc.edu
 * @date 1.21.2020
 */

import java.util.Random;

/**
 * SimpleSpeakBehavior class which implements the talk method which returns a string from str array randomly.
 */
public class SimpleSpeakBehavior implements TalkBehavior {
    Random rand = new Random();
    String[] str = {"Wall-E", "EVA!", "Pop", "Eva?", "Eee-va"};

    public String talk() {
        int r1 = rand.nextInt(4);
        return str[r1];
    }
}
