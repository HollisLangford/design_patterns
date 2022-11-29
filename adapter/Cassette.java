package adapter;

import java.util.ArrayList;

public class Cassette implements AnalogAlbum {
    private ArrayList<String> songs;
    private int currentIndex;

    public Cassette(ArrayList<String> songs) {
        this.songs = songs;
        this.currentIndex = currentIndex;
    }

    @Override
    public String play() {
        for(int currentIndex = 0; currentIndex < songs.size(); currentIndex++) {
            return songs.get(currentIndex);
        }
        return "At the end of the cassette you need to rewind";
    }

    @Override
    public String rewind() {
        for(int currentIndex=0;currentIndex<songs.size();currentIndex++) {
            return songs.get(currentIndex-1);
        }
        return "Fully Re-wound";
    }

    @Override
    public String ffwd() {
        for(int currentIndex=0;currentIndex<songs.size();currentIndex++) {
            return songs.get(currentIndex+1);
        }
        return "At the end of the cassette you need to rewind";
    }

    @Override
    public String pause() {
        return "Pausing...";
    }

    @Override
    public String stopEject() {
        return "Stopping cassette and ejecting";
    }
    
}
