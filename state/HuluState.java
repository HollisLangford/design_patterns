package state;

/**
 * class for the HuluState
 */
public class HuluState implements State {
    private TV tv;
    private String [] movies;
    private String [] tvShows;

    public HuluState(TV tv) {
        this.tv = tv;
        this.movies = movies;
        this.tvShows = tvShows;
    }

    /**
     * overrides the pressHomeButton
     */
    @Override
    public String pressHomeButton() {
        return "Loading the Home Screen...\n";
    }

    /**
     * overrides the pressNetflixButton
     */
    @Override
    public String pressNetflixButton() {
        return "Loading Netflix...\n";
    }

    /**
     *  does nothing
     */
    @Override
    public String pressHuluButton() {
        return null;
    }

    /**
     * overrides the pressMovieButton
     */
    @Override
    public String pressMovieButton() {
        return "Hulu Movies:\n- Cars\n- Cinderella\n- Wall-E\n- ET";
    }

    /**
     * overrides the pressTVButton
     */
    @Override
    public String pressTVButton() {
        return "Hulu TV Shows:\n- sesame street\n- care bears\n- loney tunes";
    }
    
}
