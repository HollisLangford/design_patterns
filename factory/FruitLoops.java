package factory;

public class FruitLoops extends Cereal{

    public FruitLoops(String name, double price) {
        super(name, price);
        name = "fruit loops";
        price = 1.89;
    }

    @Override
    public String prepare() {
        return "Preparing the Fruit Loops \n- Gather the grain \n- Shape into circles \n- Randomly color circles \n- Let circles dry";
    }
    
}
