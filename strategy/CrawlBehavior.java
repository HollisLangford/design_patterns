package strategy;

import java.util.ArrayList;

public class CrawlBehavior extends MoveBehavior {

    @Override
    public void move(ArrayList<String> character) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void move(ArrayList<String> character, int speed) {
        displayCharacter(character);
        speed = 1;
        for(int i = 0;i<NUM_MOVES*speed;i+= speed) {
            pushCharacterForward(character);
        }
    }
    
}
