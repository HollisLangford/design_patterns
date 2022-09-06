package strategy;

import java.util.ArrayList;

public class CrawlBehavior extends MoveBehavior {

    @Override
    public void move(ArrayList<String> character) {
        super.move(character, 1);
        
    }
    
}
