/**
 * @author Hardik Anand
 * @email hanand@email.sc.edu
 * @date 1.21.2020
 */

/**
 * Abstract parent class of several child classes.
 */
abstract class Robot {
    protected String name;
    protected MoveBehavior moveBehavior;
    protected TalkBehavior talkBehavior;

// Initialize constructor
    public Robot(String name) {
        this.name = name;
    }

    public abstract String toString();

// Sets the protected moveBehavior variable to the parameter of this method.
    public void setMoveBehavior(MoveBehavior moveBehavior) {
        this.moveBehavior = moveBehavior;
    }

// Sets the protected talkBehavior variable to the parameter of this method.
    public void setTalkBehavior(TalkBehavior talkBehavior) {
        this.talkBehavior = talkBehavior;
    }

    public String move() {
        return moveBehavior.move();
    }

    public String talk() {
        return talkBehavior.talk();
    }
}