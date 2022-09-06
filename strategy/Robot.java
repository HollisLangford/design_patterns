<<<<<<< HEAD
package strategy;

import java.util.ArrayList;

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
=======
package strategy;

import java.util.ArrayList;

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
>>>>>>> c6f635d898ad81faf1dc307732a7d659c335fbe4
}