
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana");

        // Example 1: Using lambda with Predicate
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);

        // Example 2: Using lambda with Consumer
        Consumer<String> printUpperCase = name -> System.out.println(name.toUpperCase());
        names.forEach(printUpperCase);

        // Example 3: Using lambda with Function
        Function<String, Integer> stringLength = name -> name.length();
        names.stream().map(stringLength).forEach(System.out::println);

        // Example 4: Using lambda to sort a list
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1);
        numbers.sort((a, b) -> a - b);
        numbers.forEach(System.out::println);

        // Example 5: Using lambda to create a runnable
        Runnable runnable = () -> System.out.println("Running in a thread");
        new Thread(runnable).start();
    }
}
