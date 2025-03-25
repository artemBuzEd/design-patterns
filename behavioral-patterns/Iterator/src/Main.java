public class Main {
    public static void main(String[] args) {
        Song song1 = new Song("Timeless", "Weekend");
        Song song2 = new Song("LOOVE", "Travis Scott");
        Song song3 = new Song("The SUN", "KayCyy");

        SongCollection songs = new SongCollection();
        songs.addSong(song1);
        songs.addSong(song2);
        songs.addSong(song3);

        for(Song s : songs){
            System.out.println(s);
        }
    }
}