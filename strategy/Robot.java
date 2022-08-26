public abstract class Robot {
    String name;
    MoveBehavior movebehavior;

    public Robot(String name) {
        this.name = name;
    }

    public void setMoveBehavior(MoveBehavior aM) {
        movebehavior = aM;
    }

    public String move() {
        return movebehavior.move;
    }

    public abstract String toString();
}