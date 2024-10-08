
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Example 1: Using lambda with Runnable
        Runnable runnable = () -> System.out.println("Hello from a lambda!");
        new Thread(runnable).start();

        // Example 2: Using lambda with a List and forEach
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println(name));

        // Example 3: Using lambda with Predicate
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(4)); // true

        // Example 4: Using lambda with Function
        Function<String, Integer> stringLength = str -> str.length();
        System.out.println(stringLength.apply("Lambda")); // 6

        // Example 5: Using lambda with Consumer
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("hello world"); // HELLO WORLD
    }
}
