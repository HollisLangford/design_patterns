package factory;

import java.util.ArrayList;

public abstract class Cereal {

    protected String name;
    protected double price;
    protected ArrayList<String> toys = new ArrayList<String>();

    public Cereal(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String prepare() {
        return name;
    }

    public String boxCereal() {
        return "Boxing the " + name;
    }

    public String priceCereal() {
        return "Putting the price tag of " + price + " on the " + name + " box";
    }
    
}
