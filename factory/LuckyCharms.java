package factory;

public class LuckyCharms extends Cereal {

    public LuckyCharms() {
        super(name, price);
        name = "lucky charms";
        price = 1.55;
    }

    @Override
    public String prepare() {
        return "Preparing the Lucky Charms \n- Gather the grain \n- Shape into Xs and Os \n- Create marshmallow shapes \n- Mix grain and marshmallows\n";
    }
    
}
