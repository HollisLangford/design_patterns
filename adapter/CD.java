package adapter;

import java.util.ArrayList;

/**
 * Class for the CD
 */

public class CD implements DigitalAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

    public CD(ArrayList<String> songs2) {
        this.songs = songs;
        this.currentIndex = currentIndex;
    }
/**
 * overrides the playFromBeginning method in the Digital album interface
 */
    @Override
    public String playFromBeginning() {
        for(int currentIndex = 0; currentIndex < songs.size(); currentIndex++) {
            return songs.get(currentIndex);
            /**
             * gets the current index in the array
             */
        }
        return "Playing song "+currentIndex;
    }

/**
 * overrides the playSong method in the Digital album interface
 */

    @Override
    public String playSong(int num) {
        for(int currentIndex = 0; currentIndex < songs.size(); currentIndex++) {
            if(num == 1) {
                return songs.get(currentIndex);
            }
            else if(num == 2) {
                return songs.get(currentIndex+1);
            }
            else if(num == 3) {
                return songs.get(currentIndex+2);
            }
            else if(num == 4) {
                return songs.get(currentIndex+3);
            }
            else if(num == 5) {
                return songs.get(currentIndex+4);
            }
            /**
             * gets the next index in the array depending on the number input
             */
            
        }
        return "Not a valid song number";
    }
/**
 * overrides the prevSong method in the Digital album interface
 */

    @Override
    public String prevSong() {
        for(int currentIndex = 0; currentIndex < songs.size(); currentIndex++) {
            return songs.get(currentIndex-1);
            /**
             * gets the previous index in the array
             */
        }
        return "Skipping back";
    }

/**
 * overrides the nextSong method in the Digital album interface
 */

    @Override
    public String nextSong() {
        for(int currentIndex = 0; currentIndex < songs.size(); currentIndex++) {
            return songs.get(currentIndex+1);
            /**
             * gets the next index in the array
             */
        }
        return "Playing";
    }
    @Override
    public String stop() {
        return "Stopping";
    }
    @Override
    public String pause() {
         return "Pausing";
    }

    
    
}
