package state;

import java.util.Scanner;

public class TV {
    private State HomeState;
    private State NetflixState;
    private State HuluState;
    State state;

    /**
     * @param HomeState State that represents the HomeState class
     * @param NetflixState State that represents the NetflixState class
     * @param HuluState State that represents the HuluState class
     */

    public TV() {
        HomeState = new HomeState(this);
        NetflixState = new NetflixState(this);
        HuluState = new HuluState(this);
        this.state = HomeState;
    }

    /**
     * calls the pressHomeButton in the HomeState class
     * @return String in Homestate class
     */
    public String pressHomeButton() {
        return HomeState.pressHomeButton();
    }

    /**
     * sets the state to a Netflix State
     * @return String in the HomeState class
     */
    public String pressNetflixButton() {
        this.state = NetflixState;
        return HomeState.pressNetflixButton();
    }

    /**
     * sets the state to a Hulu State
     * @return String in the HomeState class
     */
    public String pressHuluButton() {
        this.state = HuluState;
        return HomeState.pressHuluButton();
    }

    /**
     * if the state is Netflix
     * @return String in the NetflixState class
     * if not
     * @return String in the HuluState class
     */
    public String pressMovieButton() {
        if(this.state == NetflixState) {
            return NetflixState.pressMovieButton();
       }
        return HuluState.pressMovieButton();
    }

    /**
     * if the state is Netflix
     * @return String in the NetflixState class
     * if not
     * @return String in the HuluState class
     */
    public String pressTVButton() {
        if(this.state == NetflixState) {
            return NetflixState.pressTVButton();
        }
        return HuluState.pressTVButton();
    }

    /**
     * sets the state
     * @param state
     */
    public void setState(State state) {
        this.state = state;
    }

    /*
     * Accessor for HomeState
     */
    public State getHomeState() {
        return HomeState;
    }

    /**
     * Accessor for NetflixState
     * @return
     */
    public State getNetflixState() {
        return NetflixState;
    }

    /**
     * Accessor for HuluState
     * @return
     */
    public State getHuluState() {
        return HuluState;
    }
    
}