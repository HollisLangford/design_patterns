package factory;

import java.util.ArrayList;

public abstract class Cereal {

    protected String name;
    protected double price;
    protected ArrayList<String> toys = new ArrayList<String>();

    public String getName() {
        return name;
    }
    
}
