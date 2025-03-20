import javax.print.attribute.standard.Media;

public class Main {
    public static void main(String[] args) {
        OperatingSystem windows = new Windows();
        OperatingSystem linux = new Linux();
        OperatingSystem macOS = new MacOS();

        MediaPlayer MP4 = new MP4(macOS);
        MediaPlayer MP3 = new MP3(linux);
        MediaPlayer mp4 = new MP4(windows);

        mp4.playMedia("video.mp4");
        MP3.playMedia("song.mp3");
        MP4.playMedia("movie.mp4");
    }
}