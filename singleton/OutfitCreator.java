package singleton;

import java.util.Random;
import java.util.ArrayList;

public class OutfitCreator {
    private ArrayList<ClothingItem> tops;
    private ArrayList<ClothingItem> bottoms;
    private ArrayList<ClothingItem> whole;
    private Random rand = new Random();
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
    /*
     * Creates the outfit from the instance file
     */

    public String getOutfit(Season season) {
        String clothingString = "";
        int type = rand.nextInt(2);
        if (type == 0) {
            ArrayList<ClothingItem> tempTop = new ArrayList<ClothingItem>();
            for (ClothingItem top: tops) {
                if (top.hasSeason(season)) {
                    tempTop.add(top);
                }
            }
            clothingString += tempTop.get(rand.nextInt(tempTop.size()));
            ArrayList<ClothingItem> tempBottom = new ArrayList<ClothingItem>();
            for (ClothingItem bottom: bottoms) {
                if (bottom.hasSeason(season)) {
                    tempBottom.add(bottom);
                }
            }
            clothingString += "and " + (tempBottom.get(rand.nextInt(tempBottom.size())).toString()).toLowerCase();
        }
        else {
            ArrayList<ClothingItem> tempWhole = new ArrayList<ClothingItem>();
            for (ClothingItem whole: whole) {
                if (whole.hasSeason(season)) {
                    tempWhole.add(whole);
                }
            }
            clothingString += tempWhole.get(rand.nextInt(tempWhole.size()));
        }
        return clothingString;
        
    }
    /*
     * takes the clothes from the file and puts the tops with the bottoms and keeps a seprate operation for if the outfit turns out to be a whole
     */
    
}


