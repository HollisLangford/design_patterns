<<<<<<< HEAD
package strategy;

public class HumanRobot extends Robot {

    public HumanRobot(String name) {
        super(name);
        movebehavior = new WalkBehavior();
    }

    public String toString() {
        return name +" is a human robot";
    }
=======
package strategy;

public class HumanRobot extends Robot {

    public HumanRobot(String name) {
        super(name);
        movebehavior = new WalkBehavior();
    }

    public String toString() {
        return name +" is a human robot";
    }
>>>>>>> c6f635d898ad81faf1dc307732a7d659c335fbe4
}