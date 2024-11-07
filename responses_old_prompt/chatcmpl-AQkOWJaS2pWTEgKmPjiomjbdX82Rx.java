
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Print names using a lambda expression
        Consumer<String> printName = name -> System.out.println(name);
        names.forEach(printName);

        // Example 2: Filter names that start with 'A'
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(printName);

        // Example 3: Convert names to uppercase
        List<String> upperNames = names.stream()
            .map(name -> name.toUpperCase())
            .toList();
        upperNames.forEach(printName);

        // Example 4: Count names with more than three letters
        long count = names.stream()
            .filter(name -> name.length() > 3)
            .count();
        System.out.println("Count of names with more than 3 letters: " + count);
    }
}
