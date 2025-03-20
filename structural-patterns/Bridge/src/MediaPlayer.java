public abstract class MediaPlayer {
    protected OperatingSystem os;

    public MediaPlayer(OperatingSystem os) {
        this.os = os;
    }

    public abstract void playMedia(String fileName);
}
