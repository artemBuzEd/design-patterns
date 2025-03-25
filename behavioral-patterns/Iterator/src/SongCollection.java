import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SongCollection implements Iterable<Song>{
    List<Song> songs;

    public SongCollection() {
        songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public Iterator<Song> iterator() {
        return new SongIterator();
    }

    class SongIterator implements Iterator<Song> {
        private int currentPos = 0;

        @Override
        public boolean hasNext() {
            return currentPos < songs.size();
        }
        public Song next() {
            if(hasNext()) {
                return songs.get(currentPos++);
            }
            return null;
        }
    }
}
