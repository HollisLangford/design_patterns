package strategy;

public abstract class Robot {
    String name;
    MoveBehavior movebehavior;

    public Robot(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }

    public void setMoveBehavior(MoveBehavior aM) {
        movebehavior = aM;
    }

    public MoveBehavior move() {
        return movebehavior;
    }

    public abstract String toString();
}