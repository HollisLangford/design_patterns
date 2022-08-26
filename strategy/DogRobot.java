public class DogRobot extends Robot {

    public DogRobot(String name) {
        super(name);
        movebehavior = new CrawlBehavior();
    }

    public String toString() {
        return name +" is a dog robot"
    }
}