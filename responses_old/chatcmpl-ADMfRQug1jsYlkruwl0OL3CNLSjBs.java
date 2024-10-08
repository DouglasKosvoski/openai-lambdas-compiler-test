
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana");

        // Example 1: Filtering with a lambda
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println);

        // Example 2: Using a lambda to create a Runnable
        Runnable runnable = () -> System.out.println("Running in a separate thread");
        new Thread(runnable).start();

        // Example 3: Using lambda with a custom functional interface
        Predicate<String> isLongerThanThree = s -> s.length() > 3;
        names.stream()
             .filter(isLongerThanThree)
             .forEach(System.out::println);

        // Example 4: Sorting with a lambda
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);
        numbers.sort((a, b) -> a - b);
        numbers.forEach(System.out::println);
    }
}
