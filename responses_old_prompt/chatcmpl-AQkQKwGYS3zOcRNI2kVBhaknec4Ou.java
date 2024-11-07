
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Print all names
        Consumer<String> printName = name -> System.out.println(name);
        names.forEach(printName);

        // Example 2: Convert names to uppercase
        Function<String, String> toUpperCase = name -> name.toUpperCase();
        List<String> upperCaseNames = names.stream()
                                            .map(toUpperCase)
                                            .toList();
        System.out.println(upperCaseNames);

        // Example 3: Filter names that start with 'C'
        Predicate<String> startsWithC = name -> name.startsWith("C");
        List<String> filteredNames = names.stream()
                                           .filter(startsWithC)
                                           .toList();
        System.out.println(filteredNames);

        // Example 4: Count names with more than 3 letters
        long count = names.stream()
                          .filter(name -> name.length() > 3)
                          .count();
        System.out.println("Count of names with more than 3 letters: " + count);
    }
}
