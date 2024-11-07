
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Example 1: Using a Consumer
        Consumer<String> printName = name -> System.out.println(name);
        names.forEach(printName);

        // Example 2: Using a Predicate
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);

        // Example 3: Using a Function
        Function<String, String> toUpperCase = name -> name.toUpperCase();
        List<String> upperCaseNames = names.stream()
                                             .map(toUpperCase)
                                             .toList();
        upperCaseNames.forEach(System.out::println);

        // Example 4: Using a BiFunction
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(5, 3));

        // Example 5: Using Runnable
        Runnable task = () -> System.out.println("Task is running!");
        new Thread(task).start();
    }
}
