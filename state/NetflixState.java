package state;

import java.lang.reflect.Array;

/**
 * class for the NetflixState
 */
public class NetflixState implements State {
    private TV tv;
    private String [] movies;
    private String [] tvShows;

    public NetflixState(TV tv) {
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
     *  does nothing
     */
    @Override
    public String pressNetflixButton() {
        return null;
    }

    /**
     * overrides the pressHuluButton
     */
    @Override
    public String pressHuluButton() {
        return "Loading Hulu...\n";
    }

    /**
     * overrides the pressMovieButton
     */
    @Override
    public String pressMovieButton() {
        return "Netflix Movies:\n- The Land Before Time\n- Frozen\n- The Little Mermaid\n- Ice Age";
    }

    /**
     * overrides the pressTVButton
     */
    @Override
    public String pressTVButton() {
        return "Netflix TV Shows:\n- Peppa Pig\n- My Little Pony\n- Garfield\n- Teenage Mutant Ninja Turtles";
    }
}
