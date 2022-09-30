package singleton;

import java.util.Random;
import java.util.ArrayList;

public class OutfitCreator {
    private ArrayList<ClothingItem> tops;
    private ArrayList<ClothingItem> bottoms;
    private ArrayList<ClothingItem> wholes;
    private Random rand;
    private static OutfitCreator outfitcreator;

    private OutfitCreator() {

    }

    public static OutfitCreator getInstance() {
        if(outfitcreator == null) {
            System.out.println("Creating Outfit");
            outfitcreator = new OutfitCreator();
        }
        return outfitcreator;
    }

    public String getOutfit(Season season) {
        
        
    }
    
}


