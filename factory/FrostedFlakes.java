package factory;

public class FrostedFlakes extends Cereal {

    public FrostedFlakes() {
        super(name, price);
        name = "frosted flakes";
        price = 2.99;
    }

    @Override
    public String prepare() {
        return "Preparing the Frosted Flakes \n- Gather the grain \n- Shape into flakes \n- Sprinkle with frosting\n";
    }


    @Override
    public String boxCereal() {
        return "Boxing the Frosted Flakes \n- Drawing fun pictures of Frosted Flakes on the box \n- Pouring the Frosted Flakes into the box \n- Adding the suprise Spider Man Tattoo\n";
    }

    @Override
    public String priceCereal() {
        return "Putting the price tag of 2.99 on the Frosted Flakes box";
    }
    
}
