
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Example 1: Simple lambda expression
        Runnable runnable = () -> System.out.println("Hello from a lambda!");
        runnable.run();

        // Example 2: Lambda expression with a single parameter
        Consumer<String> consumer = name -> System.out.println("Hello, " + name);
        consumer.accept("Alice");

        // Example 3: Lambda expression with multiple parameters
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println("Sum: " + sum.apply(5, 10));

        // Example 4: Using lambda expressions with a list
        List<String> names = Arrays.asList("John", "Jane", "Mary");
        names.forEach(name -> System.out.println("Name: " + name));

        // Example 5: Lambda expression with a predicate
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));

        // Example 6: Lambda expression with a function
        Function<String, String> toUpperCase = str -> str.toUpperCase();
        System.out.println("Uppercase: " + toUpperCase.apply("hello"));

        // Example 7: More complex lambda expression with filtering
        List<String> filteredNames = names.stream()
                                            .filter(name -> name.startsWith("J"))
                                            .toList();
        System.out.println("Filtered Names: " + filteredNames);
    }
}
