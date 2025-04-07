import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = List.of(16, 5, 18, 2, 7, 9);
        List<Double> doubleList = List.of(3.5, 5.2, 7.8, 9.0);
        List<String> stringList = List.of("Apple", "banana", "Cherry", "date", "Elderberry");
        String sentence = "Hello my name is Bob, and I am the sentences";

        System.out.println("1. Odd numbers: " + Lambda.oddFilter(intList));
        System.out.println("2. Average of doubles: " + Lambda.findAverage(doubleList));
        System.out.println("3. Sorted strings alphabetically: " + Lambda.sortStringsByAscii(stringList));
        System.out.println("4. Sum of even numbers: " + Lambda.sumOfEvenNumbers(intList));
        System.out.println("5. Factorial of 5: " + Lambda.findFactorial(5));
        System.out.println("6. Multiplication of all elements: " + Lambda.multiplyElements(intList));
        System.out.println("7. Squares of elements: " + Lambda.squareOfEachElements(intList));
        System.out.println("8. Strings sorted by length: " + Lambda.sortStringsByLength(stringList));
        System.out.println("9. Word count in sentence: " + (Lambda.countWordsInString(sentence) + 1));
        System.out.println("10. First non-empty string: " + Lambda.findFirstNotEmptyString(stringList).orElse("None"));
        System.out.println("11. All strings start with uppercase? " + Lambda.isAllStringsStartsWithUpperCase(stringList));
        System.out.println("12. Second largest number: " + Lambda.findSecondMaxInteger(intList));
        System.out.println("13. Max even number: " + Lambda.findMaxEvenNumbers(intList));
    }
}