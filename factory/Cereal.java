package factory;

import java.util.ArrayList;

public abstract class Cereal {

    protected static String name;
    protected static double price;
    protected ArrayList<String> toys = new ArrayList<String>();

    public Cereal(String name, double price) {
        Cereal.name = name;
        Cereal.price = price;
    }

    public String prepare() {
        return name;
    }

    public String boxCereal() {
        return "Boxing the " + name +" \n- Drawing fun pictures of " + name +" on the box \n- Pouring the " + name +" into the box \n- Adding the suprise My Little Pony Stickers\n";
    }

    public String priceCereal() {
        return "Putting the price tag of " + price + " on the " + name + " box";
    }
    
}
