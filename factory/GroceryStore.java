package factory;

public class GroceryStore {

    public  GroceryStore() {}

    public Cereal createCereal(String cerealType) {
        Cereal cereal;

        if(cerealType.equals("frosted flakes")) {
            cereal = new FrostedFlakes(cerealType, 0);
        }
        else if(cerealType.equals("fruit loops")) {
            cereal = new FruitLoops(cerealType, 0);
        }
        else if(cerealType.equals("lucky charms")) {
            cereal = new LuckyCharms(cerealType, 0);
        }

        cereal.prepare();
        cereal.boxCereal();
        cereal.priceCereal();
        return cereal;
    }
}
