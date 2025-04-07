import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Lambda {
    public static List<Integer>  oddFilter(List<Integer> list) {
        return list.stream().filter(x -> x % 2 == 1).collect(Collectors.toList());
    }

    public static double findAverage(List<Double> list) {
        return list.stream().collect(Collectors.averagingDouble(Double::doubleValue));
    }

    public static List<String> sortStringsByAscii(List<String> list) {
        return list.stream().sorted().collect(Collectors.toList());
    }

    public static int sumOfEvenNumbers(List<Integer> list) {
        return list.stream().filter(x -> x % 2 == 0).mapToInt(x -> x).sum();
    }

    public static long findFactorial(int n) {
        return LongStream.rangeClosed(1, n).reduce(1, (x, y) -> x * y);
    }

    public static int multiplyElements(List<Integer> list) {
        return list.stream().reduce(1, (x, y) -> x * y);
    }

    public static List<Integer> squareOfEachElements(List<Integer> list) {
        return list.stream().map(x -> x * x).collect(Collectors.toList());
    }

    public static List<String> sortStringsByLength(List<String> list) {
        return list.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
    }

    public static long countWordsInString(String string) {
        return string.chars().filter(Character::isSpaceChar).count();
    }

    public static Optional<String> findFirstNotEmptyString(List<String> list) {
        return list.stream().filter(str -> !str.isEmpty()).findFirst();
    }

    public static boolean isAllStringsStartsWithUpperCase(List<String> list) {
        return list.stream().allMatch(x -> Character.isUpperCase(x.charAt(0)));
    }

    public static int findSecondMaxInteger(List<Integer> list) {
        int max = list.stream().max(Integer::compareTo).get();
        return list.stream().max((val, val2) -> Integer.compare(max, val)).get();
    }

    public static int findMaxEvenNumbers(List<Integer> list) {
        return list.stream().filter(x -> x % 2 == 0).max(Integer::compareTo).get();
    }
}
