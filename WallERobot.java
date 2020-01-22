/**
 * @author Hardik Anand
 * @email hanand@email.sc.edu
 * @date 1.21.2020
 */

/**
 * WallERobot class which returns the name constructor from parent (Robot) class and implements the toString method
 */
public class WallERobot extends Robot {
    public WallERobot(String name) {
        super(name);
        moveBehavior = new WalkBehavior();
        talkBehavior = new SimpleSpeakBehavior();
    }

    @Override
    public String toString() {
        return name + " is an environmentally friendly Wall-E Robot";
    }
}

