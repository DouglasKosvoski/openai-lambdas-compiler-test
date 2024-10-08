
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Filter names starting with 'A'
        names.stream()
            .filter(name -> name.startsWith("A"))
            .forEach(System.out::println);

        // Example 2: Convert names to uppercase
        names.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);

        // Example 3: Check if any name has length greater than 5
        boolean anyLongNames = names.stream().anyMatch(name -> name.length() > 5);
        System.out.println(anyLongNames);

        // Example 4: Count names that contain the letter 'a'
        long count = names.stream()
            .filter(name -> name.toLowerCase().contains("a"))
            .count();
        System.out.println(count);

        // Example 5: Sort names by length
        names.stream()
            .sorted((a, b) -> Integer.compare(a.length(), b.length()))
            .forEach(System.out::println);
    }
}
