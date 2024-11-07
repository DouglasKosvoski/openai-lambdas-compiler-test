
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Filtering with Predicate
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);

        // Example 2: Transforming with Function
        Function<String, String> toUpperCase = String::toUpperCase;
        List<String> uppercasedNames = names.stream().map(toUpperCase).toList();
        uppercasedNames.forEach(System.out::println);

        // Example 3: Consuming with Consumer
        Consumer<String> printer = System.out::println;
        names.forEach(printer);

        // Example 4: Summing with a custom operation
        int sum = Arrays.asList(1, 2, 3, 4).stream().reduce(0, (total, num) -> total + num);
        System.out.println("Sum: " + sum);
    }
}
