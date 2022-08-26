public class iRobot extends Robot {

    public iRobot(String name) {
        super(name);
        movebehavior = new RunBehavior();
    }

    public String toString() {
        return name +"this is an iRobot";
    }
}