/**
 * @author Hardik Anand
 * @email hanand@email.sc.edu
 * @date 1.21.2020
 */

import java.util.Random;

/**
 * SpeakBehavior class which implements the talk method and returns a string from str array randomly.
 */
public class SpeakBehavior implements TalkBehavior {
    Random rand = new Random();
    String[] str = {"Hello", "How are you?", "Good day"};

    public String talk() {
        int r1 = rand.nextInt(3);
        return str[r1];
    }
}
