package factory;

public class FrostedFlakes extends Cereal {

    public FrostedFlakes(String name, double price) {
        super(name, price);
        name = "frosted flakes";
        price = 2.99;
    }

    @Override
    public String prepare() {
        return "Preparing the Frosted Flakes \n- Gather the grain \n- Shape into flakes \n- Sprinkle with frosting";
    }
    
}
