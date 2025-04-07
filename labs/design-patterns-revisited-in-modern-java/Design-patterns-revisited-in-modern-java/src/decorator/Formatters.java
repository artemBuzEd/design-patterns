package decorator;

import java.util.function.Function;

public class Formatters {
    public static Function<String, String> toUpper() {
        return String::toUpperCase;
    }

    public static Function<String, String> toLower() {
        return String::toLowerCase;
    }

    public static Function<String, String> addQuotes() {
        return text -> "\"" + text + "\"";
    }

    public static Function<String, String> addPrefix(String prefix) {
        return text -> prefix + text;
    }

    public static Function<String, String> addSuffix(String suffix) {
        return text -> text + suffix;
    }

    public static Function<String, String> trimWhitespaces() {
        return String::trim;
    }
}
