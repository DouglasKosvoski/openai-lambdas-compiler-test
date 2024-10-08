
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
        Function<String, String> toUpperCase = String::toUpperCase;
        names.stream().map(toUpperCase).forEach(System.out::println);

        // Example 3: Using a lambda expression with Consumer
        Consumer<String> printName = name -> System.out.println(name);
        names.forEach(printName);

        // Example 4: Using lambda to sort a list
        List<Integer> numbers = Arrays.asList(3, 2, 1, 5, 4);
        numbers.sort((a, b) -> a - b);
        numbers.forEach(System.out::println);

        // Example 5: Using lambda for a custom operation
        List<Integer> squared = Arrays.asList(1, 2, 3, 4).stream()
            .map(x -> x * x).toList();
        squared.forEach(System.out::println);
    }
}
