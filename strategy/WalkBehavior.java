package strategy;

import java.util.ArrayList;

public class WalkBehavior extends MoveBehavior {

    @Override
    public void move(ArrayList<String> character) {
        super.move(character, 2);
        
    }
    
}
