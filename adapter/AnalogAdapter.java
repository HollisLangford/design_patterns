package adapter;

/**
 * Class for the Analog Adapter
 */

public class AnalogAdapter implements AnalogAlbum {
    private DigitalAlbum album;

    public AnalogAdapter(DigitalAlbum album) {
        this.album = album;
    }

    @Override
    public String play() {
       return album.playFromBeginning();
       /**
        * Calls the playFromBeginning method in CD
        */
    }

    @Override
    public String rewind() {
        return album.prevSong();
        /**
         * Calls the prevSong method in CD
         */
    }

    @Override
    public String ffwd() {
        return album.nextSong();
        /**
         * Calls the nextSong method in CD
         */
    }

    @Override
    public String pause() {
        return album.pause();
    }

    @Override
    public String stopEject() {
        return album.stop();
    }

    
}
