public class MP3 extends MediaPlayer {
    public MP3(OperatingSystem os){
        super(os);
    }

    @Override
    public void playMedia(String fileName) {
        System.out.println("Using MP3 ");
        os.play(fileName);
    }
}
