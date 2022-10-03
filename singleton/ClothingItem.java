package singleton;

import java.util.ArrayList;

public class ClothingItem {
    private String name = "";
    private ClothingPart part;
    private String color = "";
    private ArrayList<Season> seasons;

    public ClothingItem(String name, ClothingPart part, String color) {
        this.name = name;
        this.part = part;
        this.color = color;
    }

    public boolean hasSeason(Season season) {
        for (Season tempSeason: seasons) {
            if (tempSeason == season) {
                return true;
            }
        }
        return false;
    }
    /*
     * verifies that the outfit has a season
     */

    public void addSeason(Season season) {
        if (!(this.hasSeason(season))) {
            seasons.add(season);
        }
    }
    /*
     * adds the season to the outfit if it is not already there
     */

    public String toString() {
        return name + " "+ color + " " + part;
    }
    
}
