
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana");

        // Example 1: Filter and print names starting with 'A'
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println);

        // Example 2: Sort names by length and print
        names.stream()
             .sorted((a, b) -> Integer.compare(a.length(), b.length()))
             .forEach(System.out::println);

        // Example 3: Convert names to uppercase
        List<String> upperCaseNames = names.stream()
                                            .map(name -> name.toUpperCase())
                                            .toList();
        System.out.println(upperCaseNames);

        // Example 4: Count names with more than 3 letters
        long count = names.stream()
                          .filter(name -> name.length() > 3)
                          .count();
        System.out.println(count);

        // Example 5: Reduce to concatenate names
        String concatenated = names.stream()
                                   .reduce("", (a, b) -> a + b + " ");
        System.out.println(concatenated.trim());
    }
}
