
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Using a lambda expression with Predicate
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);

        // Example 2: Using a lambda expression with Function
        Function<String, Integer> stringLength = String::length;
        names.stream().map(stringLength).forEach(System.out::println);

        // Example 3: Using a lambda expression with Consumer
        Consumer<String> greet = name -> System.out.println("Hello, " + name);
        names.forEach(greet);

        // Example 4: Sorting using a lambda expression
        names.sort((n1, n2) -> n1.compareTo(n2));
        names.forEach(System.out::println);
    }
}
