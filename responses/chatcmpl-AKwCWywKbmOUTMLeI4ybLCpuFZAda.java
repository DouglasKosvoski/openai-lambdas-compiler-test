
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Using lambda expression with Consumer
        Consumer<String> printName = name -> System.out.println(name);
        names.forEach(printName);

        // Example 2: Using lambda expression with Predicate
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);

        // Example 3: Using lambda expression with Function
        Function<String, String> toUpperCase = name -> name.toUpperCase();
        List<String> upperNames = names.stream().map(toUpperCase).toList();
        upperNames.forEach(System.out::println);

        // Example 4: Using lambda expression with sorting
        names.sort((a, b) -> b.compareTo(a));
        names.forEach(System.out::println);
    }
}
