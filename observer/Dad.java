package observer;

import java.util.Random;

public class Dad implements Observer {
    Subject Baby;
    Random r = new Random();

    public Dad(Subject Baby){
        this.Baby = Baby;
        Baby.registerObserver(this);
    }

    public void update(Cry cry){
        int random = r.nextInt(2);
        if(random == 0){
            System.out.println("Dad puts a pillow over his head");
        }
        else if(random == 1){
            System.out.println("Dad nudges mom");
        }
        else if(random == 2){
            System.out.println("Dad screams .... aaaaa");
        }
    }
    
}
