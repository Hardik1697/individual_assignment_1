/**
 * @author Hardik Anand
 * @email hanand@email.sc.edu
 * @date 1.21.2020
 */

/**
 * DogRobot class which is the child class of Robot.
 */
class DogRobot extends Robot {

    public DogRobot(String name) {
        super(name);
        moveBehavior = new CrawlBehavior();
        talkBehavior = new BarkBehavior();
    }

    @Override
    public String toString() {
        return name + " is a happy dog robot";
    }
}
