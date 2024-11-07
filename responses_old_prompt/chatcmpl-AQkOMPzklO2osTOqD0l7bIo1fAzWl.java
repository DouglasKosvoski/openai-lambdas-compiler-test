
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Using lambda expression with Consumer
        Consumer<String> greet = name -> System.out.println("Hello, " + name + "!");
        names.forEach(greet);

        // Example 2: Using lambda expression with Predicate
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);

        // Example 3: Using lambda expression with Function
        Function<String, String> toUpperCase = String::toUpperCase;
        List<String> upperCaseNames = names.stream()
                                            .map(toUpperCase)
                                            .toList();
        upperCaseNames.forEach(System.out::println);

        // Example 4: Using lambda expression for sorting
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1);
        numbers.sort((a, b) -> b - a);
        numbers.forEach(System.out::println);
    }
}
