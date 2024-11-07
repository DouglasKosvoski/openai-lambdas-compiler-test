
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Using lambda with Consumer
        Consumer<String> printName = name -> System.out.println(name);
        names.forEach(printName);

        // Example 2: Using lambda with Predicate
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);

        // Example 3: Using lambda with Function
        Function<String, Integer> stringLength = name -> name.length();
        names.stream().map(stringLength).forEach(System.out::println);

        // Example 4: Using lambda with Runnable
        Runnable task = () -> System.out.println("Task is running");
        new Thread(task).start();
    }
}
