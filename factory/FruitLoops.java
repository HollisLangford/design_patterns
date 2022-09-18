package factory;

public class FruitLoops extends Cereal{

    public FruitLoops() {
        super(name, price);
        name = "fruit loops";
        price = 1.89;
    }

    @Override
    public String prepare() {
        return "Preparing the Fruit Loops \n- Gather the grain \n- Shape into circles \n- Randomly color circles \n- Let circles dry\n";
    }

    @Override
    public String boxCereal() {
        return "Boxing the Fruit Loops \n- Drawing fun pictures of Fruit Loops on the box \n- Pouring the Fruit Loops into the box \n- Adding the suprise Paw Patrol Stickers\n";
    }

    @Override
    public String priceCereal() {
        return "Putting the price tag of 1.89 on the Fruit Loops box";
    }
    
}
