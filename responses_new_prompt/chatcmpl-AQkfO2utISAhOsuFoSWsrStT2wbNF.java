
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Example 1: Using a lambda expression with a Runnable
        Runnable runnable = () -> System.out.println("Hello from a lambda Runnable!");
        runnable.run();

        // Example 2: Using a lambda expression with a custom functional interface
        CustomFunctionalInterface customFunc = (a, b) -> a + b;
        System.out.println("Sum: " + customFunc.calculate(5, 10));

        // Example 3: Using Predicate to filter a list
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println);

        // Example 4: Using Function to transform a list
        Function<String, Integer> stringLength = String::length;
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        words.stream()
             .map(stringLength)
             .forEach(System.out::println);

        // Example 5: Using Consumer to print elements of a list
        Consumer<String> printConsumer = System.out::println;
        names.forEach(printConsumer);

        // Example 6: Using a lambda expression with a comparator
        List<Integer> numbers = Arrays.asList(4, 2, 7, 1, 3);
        numbers.sort((n1, n2) -> Integer.compare(n1, n2));
        numbers.forEach(System.out::println);
    }

    @FunctionalInterface
    interface CustomFunctionalInterface {
        int calculate(int a, int b);
    }
}
