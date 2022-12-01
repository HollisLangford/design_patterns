package adapter;

import java.util.ArrayList;

/**
 * Class for the Cassette
 */

public class Cassette implements AnalogAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

    public Cassette(ArrayList<String> songs) {
        this.songs = songs;
        this.currentIndex = currentIndex;
    }
/**
 * overrides the play method in the analog album interface
 */
    @Override
    public String play() {
        for(int currentIndex = 0; currentIndex < songs.size();currentIndex++) {
            return songs.get(currentIndex);
            /**
             * gets the current index in the array
             */
        }
        return "At the end of the cassette you need to rewind";
    }

 /**
 * overrides the rewind method in the analog album interface
 */
    @Override
    public String rewind() {
        for(int currentIndex=0;currentIndex<songs.size();currentIndex++) {
            return songs.get(currentIndex-1);
             /**
             * gets the next index in the array
             */
        }
        return "Fully Re-wound";
    }
/**
 * overrides the fast forward method in the analog album interface
 */
    @Override
    public String ffwd() {
        for(int currentIndex=0;currentIndex<songs.size();currentIndex++) {
            return songs.get(currentIndex+1);
             /**
             * gets the previous index in the array
             */
        }
        return "At the end of the cassette you need to rewind";
    }
/**
 * overrides the pause method in the analog album interface
 */
    @Override
    public String pause() {
        return "Pausing...";
    }
/**
 * overrides the stop eject method in the analog album interface
 */
    @Override
    public String stopEject() {
        return "Stopping cassette and ejecting";
    }
    
}
