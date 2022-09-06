package strategy;

import java.util.ArrayList;

public class DogRobot extends Robot {

    public DogRobot(String name) {
        super(name);
        movebehavior = new CrawlBehavior();
    }

    protected void displayCharacter(ArrayList<String> character) {
        for (int j = 0; j < character.size(); j++) {
            System.out.println(character.get(j));
        }
    }

    public String toString() {
        return name +" is a dog robot";
    }
}