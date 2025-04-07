package decorator;

import java.util.function.Function;
import java.util.stream.Stream;

public class TextProcessor {
    private Function<String, String> formatChain;

    public TextProcessor(Function<String, String>... formatChain) {
        this.formatChain = Stream.of(formatChain).reduce(Function.identity(), Function::andThen);
    }

    public String process(String text) {
        if(!text.isEmpty()) {
            return formatChain.apply(text);
        }
        return null;
    }

}
