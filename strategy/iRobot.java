<<<<<<< HEAD
package strategy;

public class iRobot extends Robot {

    public iRobot(String name) {
        super(name);
        movebehavior = new RunBehavior();
    }

    public String toString() {
        return name +" is an iRobot";
    }
=======
package strategy;

public class iRobot extends Robot {

    public iRobot(String name) {
        super(name);
        movebehavior = new RunBehavior();
    }

    public String toString() {
        return name +" is an iRobot";
    }
>>>>>>> c6f635d898ad81faf1dc307732a7d659c335fbe4
}