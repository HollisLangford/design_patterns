package observer;

public class Mom implements Observer {
    Subject Baby;

    public Mom(Subject Baby){
        this.Baby = Baby;
        Baby.registerObserver(this);
    }

    /**
     * grabs the name of the baby from the baby class and displays the proper output based on the cry
     */

    public void update(Cry cry){
        if(Cry.ANGRY != null){
            System.out.println("Mom hugs "+((observer.Baby) Baby).getName());
            ((Baby)Baby).receiveLove();
        }
        else if( Cry.HUNGRY != null){
            System.out.println("Mom feeds "+((observer.Baby) Baby).getName());
           ((Baby)Baby).eat();
        }
        else if(Cry.WET != null){
            System.out.println("Mom changes "+((observer.Baby) Baby).getName());
            ((Baby)Baby).getChanged();
        }
    }
    
}
