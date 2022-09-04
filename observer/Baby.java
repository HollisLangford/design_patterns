package observer;

import java.util.ArrayList;
import java.util.Random;

public class Baby implements Subject {
    String name = "";
    ArrayList<Observer> observers;
    Random rand = new Random();

    public Baby() {
        observers = new ArrayList<Observer>();
    }

    public Baby(String name) {
        name = this.name;
    }
    public String getName() {
        return this.name;
    }
    public void receiveLove() {
        int random = rand.nextInt(1);
        if(random == 0){
            System.out.println(this.getName()+ " feels appreciated and loved.");
        }
        else if(random == 1){
            System.out.println(this.getName()+ " pushes everyone away and continues to cry.");
        }

    }
    public void eat() {
        int random = rand.nextInt(1);
        if(random == 0){
            System.out.println(this.getName()+ " has a happy full tummy.");
        }
        if(random == 1){
            System.out.println(this.getName()+ " throws all his food on the floor.");
        }

    }
    public void getChanged() {
        System.out.println(this.getName()+ " is having a diaper change");

    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    @Override
    public void notifyObservers(Cry cry) {
        for(Observer observer : observers){
            observer.update(null);
        }
        
    }
    public void angryCry() {
        System.out.println("Waaaaaaaaaa! "+this.getName()+" is feeling abandoned and angry.");
        notifyObservers(Cry.ANGRY);

    }
    public void hungryCry() {
        System.out.println("Neh Neh Neh! "+this.getName()+" is starving!!!!");
        notifyObservers(Cry.HUNGRY);

    }
    public void wetCry() {
        System.out.println("Aaaaaaaa! " + this.getName() + " is WET!");
        notifyObservers(Cry.WET);

    }
}
