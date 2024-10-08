
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Filtering with a lambda expression
        names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);

        // Example 2: Sorting with a lambda expression
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1);
        numbers.sort((a, b) -> a.compareTo(b));
        System.out.println(numbers);

        // Example 3: Using Predicate with lambda
        Predicate<String> startsWithB = name -> name.startsWith("B");
        names.stream().filter(startsWithB).forEach(System.out::println);

        // Example 4: Using a lambda expression to define a Runnable
        Runnable task = () -> System.out.println("Task executed!");
        new Thread(task).start();

        // Example 5: Transforming elements with lambda
        List<Integer> squared = numbers.stream().map(n -> n * n).toList();
        System.out.println(squared);
    }
}
