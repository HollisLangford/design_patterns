package strategy;

public class HumanRobot extends Robot {

    public HumanRobot(String name) {
        super(name);
        movebehavior = new WalkBehavior();
    }

    public String toString() {
        return name +" is a human robot";
    }
}