import java.util.LinkedList;
import java.util.Queue;

public class ReelsProxy implements Media {
    private String title;
    private String creator;
    private Reels reels;
    private Queue<Media> last5videos = new LinkedList<Media>();

    public ReelsProxy(String title, String creator) {
        this.title = title;
        this.creator = creator;
    }
    private Media loadFromCache() {
        for(Media media : last5videos) {
            if(media.getTitle().equals(title) && media.getCreator().equals(creator)) {
                System.out.println(media.getTitle() + " " + media.getCreator() + "loaded from cache.");
                return media;
            }
        }
        return null;
    }
    private void addToCache(Media media){
        if(last5videos.size() >= 5){
            last5videos.poll();
        }
        last5videos.offer(media);
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getCreator() {
        return creator;
    }

    @Override
    public void play() {
        if(reels == null){
            reels = (Reels)loadFromCache();
            if(reels == null){
                reels = new Reels(creator, title);
                addToCache(reels);
            }
        }
        reels.play();
    }
}
