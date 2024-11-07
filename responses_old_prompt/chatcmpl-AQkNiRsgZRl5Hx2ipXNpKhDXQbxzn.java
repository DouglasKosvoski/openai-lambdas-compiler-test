
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Using a lambda expression with Predicate to filter names
        names.stream().filter(name -> name.startsWith("C")).forEach(System.out::println);

        // Example 2: Using a lambda expression with Function to convert names to uppercase
        Function<String, String> toUpperCase = name -> name.toUpperCase();
        names.stream().map(toUpperCase).forEach(System.out::println);

        // Example 3: Using a lambda expression with Consumer to print names
        Consumer<String> printer = name -> System.out.println("Name: " + name);
        names.forEach(printer);

        // Example 4: Using lambda expressions to sort and print names
        names.stream().sorted((a, b) -> a.compareTo(b)).forEach(System.out::println);
    }
}
