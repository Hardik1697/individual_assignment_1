/**
 * @author Hardik Anand
 * @email hanand@email.sc.edu
 * @date 1.21.2020
 */

/**
 * HumanRobot class which is the child class of Robot.
 */
public class HumanRobot extends Robot {
    public HumanRobot(String name) {
        super(name);
        moveBehavior = new WalkBehavior();
        talkBehavior = new SpeakBehavior();
    }

    @Override
    public String toString() {
        return name + " is a typical human robot";
    }
}
