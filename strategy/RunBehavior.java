package strategy;

import java.util.ArrayList;

public class RunBehavior extends MoveBehavior {

    @Override
    public void move(ArrayList<String> character) {
        
        
    }
    
    @Override
    public void move(ArrayList<String> character, int speed) {
        super.move(character, 3);
    }
}
