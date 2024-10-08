
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Print all names
        names.forEach(name -> System.out.println(name));

        // Example 2: Filter names that start with 'A'
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(name -> System.out.println(name));

        // Example 3: Count names that have more than 3 letters
        long count = names.stream()
                          .filter(name -> name.length() > 3)
                          .count();
        System.out.println("Count of names > 3 letters: " + count);

        // Example 4: Use Predicate to check for names with 'a'
        Predicate<String> hasA = name -> name.toLowerCase().contains("a");
        names.stream()
             .filter(hasA)
             .forEach(name -> System.out.println("Contains 'a': " + name));

        // Example 5: Sorting names in reverse order
        names.stream()
             .sorted((n1, n2) -> n2.compareTo(n1))
             .forEach(name -> System.out.println("Sorted reverse: " + name));
    }
}
