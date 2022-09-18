package factory;

public class GroceryStore {

    public  GroceryStore() {}

    public Cereal createCereal(String cerealType) {
        Cereal cereal = null;

        if(cerealType.equals("frosted flakes")) {
            cereal = new FrostedFlakes();
        }
        else if(cerealType.equals("fruit loops")) {
            cereal = new FruitLoops();
        }
        else if(cerealType.equals("lucky charms")) {
            cereal = new LuckyCharms();
        }

        cereal.prepare();
        cereal.boxCereal();
        cereal.priceCereal();
        return cereal;
    }
}
