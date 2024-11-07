
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");

        // Example 1: Filter names with length > 3
        names.stream()
             .filter(name -> name.length() > 3)
             .forEach(System.out::println);

        // Example 2: Convert names to uppercase
        names.stream()
             .map(name -> name.toUpperCase())
             .forEach(System.out::println);

        // Example 3: Check if any name starts with 'C'
        boolean anyStartsWithC = names.stream()
                                       .anyMatch(name -> name.startsWith("C"));
        System.out.println(anyStartsWithC);

        // Example 4: Count names that end with 'e'
        long countEndsWithE = names.stream()
                                    .filter(name -> name.endsWith("e"))
                                    .count();
        System.out.println(countEndsWithE);
        
        // Example 5: Create a greeting
        names.forEach(name -> System.out.println("Hello, " + name + "!"));
    }
}
