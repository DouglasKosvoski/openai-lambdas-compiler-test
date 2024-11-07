
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Example 1: Using lambda to iterate over a list
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println("Hello, " + name + "!"));

        // Example 2: Using a Predicate to filter a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Predicate<Integer> isEven = num -> num % 2 == 0;
        numbers.stream().filter(isEven).forEach(num -> System.out.println(num + " is even"));

        // Example 3: Using Function to convert strings to their lengths
        List<String> phrases = Arrays.asList("Hello", "Lambda", "Expressions");
        Function<String, Integer> stringLength = str -> str.length();
        phrases.stream().map(stringLength).forEach(length -> System.out.println("Length: " + length));

        // Example 4: Using a Consumer to print elements
        Consumer<String> printConsumer = str -> System.out.println("Item: " + str);
        names.forEach(printConsumer);

        // Example 5: Using BiFunction to add two integers
        java.util.function.BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("Sum: " + add.apply(5, 10));

        // Example 6: Using a lambda expression as a Runnable
        Runnable runnable = () -> System.out.println("Running in a separate thread");
        new Thread(runnable).start();

        // Example 7: Using a supplier to generate random numbers
        java.util.function.Supplier<Double> randomSupplier = () -> Math.random();
        System.out.println("Random Number: " + randomSupplier.get());
    }
}
