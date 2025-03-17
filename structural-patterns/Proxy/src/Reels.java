public class Reels implements Media {
    private String creator;
    private String title;

    public Reels(String creator, String title) {
        this.creator = creator;
        this.title = title;
        loadFromDB();
    }

    private void loadFromDB(){
        System.out.println("Loading " + title + " from database...");
    }

    @Override
    public void play() {
        System.out.println("Playing " + title + " from " + creator);
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getCreator() {
        return creator;
    }
}
