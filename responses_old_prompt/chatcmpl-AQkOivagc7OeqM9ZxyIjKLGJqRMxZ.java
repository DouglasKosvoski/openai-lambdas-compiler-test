
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana");

        // Example 1: Using Predicate
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);

        // Example 2: Using Function
        Function<String, Integer> nameLength = name -> name.length();
        names.stream().map(nameLength).forEach(System.out::println);

        // Example 3: Using Consumer
        Consumer<String> printName = name -> System.out.println(name);
        names.forEach(printName);

        // Example 4: Using BiFunction
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(5, 3));

        // Example 5: Using Runnable
        Runnable task = () -> System.out.println("Task executed!");
        new Thread(task).start();
    }
}
