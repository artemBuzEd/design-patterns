public class SmileEmoji implements Emoji {
    private final String emojiSymbol;

    public SmileEmoji(String emojiSymbol) {
        this.emojiSymbol = emojiSymbol;
    }

    @Override
    public void printEmoji() {
        System.out.println(emojiSymbol);
    }
}
