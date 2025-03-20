public class PoopEmoji implements Emoji {
    private final String emojiSymbol;

    public PoopEmoji(String emojiSymbol) {
        this.emojiSymbol = emojiSymbol;
    }
    @Override
    public void printEmoji() {
        System.out.println("Poop emoji displayed");
    }
}
