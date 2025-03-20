import java.util.HashMap;
import java.util.Map;

public class EmojiFactory {
    private static EmojiFactory instance;

    private Map<String, Emoji> emojis;

    private EmojiFactory() {
        emojis = new HashMap<String, Emoji>();
    }

    public static EmojiFactory getInstance() {
        if (instance == null) {
            instance = new EmojiFactory();
        }
        return instance;
    }

    public Emoji getEmoji(String emojiName) {
        if(emojis.containsKey(emojiName)) {
            return emojis.get(emojiName);
        } else {
            Emoji emoji;
            if("poop".equals(emojiName)) {
                emoji = new PoopEmoji("()");
            } else {
                emoji = new SmileEmoji(":)");;
            }
            emojis.put(emojiName, emoji);
            return emoji;
        }
    }
}
