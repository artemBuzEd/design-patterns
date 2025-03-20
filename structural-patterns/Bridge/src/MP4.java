public class MP4 extends MediaPlayer {
    public MP4(OperatingSystem os) {
        super(os);
    }

    @Override
    public void playMedia(String filename){
        System.out.println("Using MP4 ");
        os.play(filename);
    }
}
