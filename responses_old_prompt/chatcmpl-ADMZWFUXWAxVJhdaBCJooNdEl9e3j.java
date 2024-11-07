
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Example 1: No parameters
        Runnable task = () -> System.out.println("Task executed");
        task.run();

        // Example 2: Single parameter
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println(name));

        // Example 3: Multiple parameters
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(5, 10));

        // Example 4: Filtering with Predicate
        Predicate<String> isLongerThan3 = str -> str.length() > 3;
        names.stream().filter(isLongerThan3).forEach(System.out::println);

        // Example 5: Sorting with Comparator
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1);
        numbers.sort((a, b) -> b - a);
        numbers.forEach(n -> System.out.print(n + " "));
    }
}
