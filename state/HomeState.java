package state;

/**
 * class for the HomeState
 */ 
public class HomeState implements State {
    private TV tv;

    public HomeState(TV tv) {
        this.tv = tv;
    }

    /**
     * overrides the pressHomeButton
     */
    @Override
    public String pressHomeButton() {
        return "TV is already on the home screen\n";
    }

    /**
     * overrides the pressNetflixButton
     */
    @Override
    public String pressNetflixButton() {
        return "Loading Netflix...\n";
    }

    /**
     * overrides the pressHuluButton
     */
    @Override
    public String pressHuluButton() {
        return "Loading Hulu...\n";
    }

    /**
     *  does nothing
     */
    @Override
    public String pressMovieButton() {
        return null;
    }

    /**
     *  does nothing
     */
    @Override
    public String pressTVButton() {
        return null;
    }
    
}
