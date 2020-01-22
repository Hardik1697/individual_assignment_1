/**
 * @author Hardik Anand
 * @email hanand@email.sc.edu
 * @date 1.21.2020
 */

/**
 * iRobot robot class which is the child class of Robot.
 */
public class iRobot extends Robot {
    public iRobot(String name) {
        super(name);
        moveBehavior = new RunBehavior();
        talkBehavior = new SpeakBehavior();
    }

    @Override
    public String toString() {
        return name + " is a scary iRobot!!!";
    }
}
