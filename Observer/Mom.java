package Observer;

public class Mom implements Observer {
    Subject Baby;

    public Mom(Subject Baby){
        this.Baby = Baby;
        Baby.registerObserver(this);
    }

    public void update(Cry cry){
        if(Cry.ANGRY != null){
            System.out.println("Mom hugs "+this.Baby);
            receiveLove();
        }
        else if( Cry.HUNGRY != null){
            System.out.println("Mom feeds "+this.Baby);
            eat();
        }
        else if(Cry.WET != null){
            System.out.println("Mom changes "+this.Baby);
            getChanged();
        }
    }
    
}
