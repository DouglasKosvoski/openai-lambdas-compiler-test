
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // Example 1: Simple lambda expression for Runnable
        Runnable runnable = () -> System.out.println("Running in a separate thread!");
        new Thread(runnable).start();

        // Example 2: Lambda expression with parameter and return value
        Function<Integer, Integer> square = x -> x * x;
        System.out.println("Square of 5 is: " + square.apply(5));

        // Example 3: Predicate to filter even numbers
        Predicate<Integer> isEven = num -> num % 2 == 0;
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.stream().filter(isEven).forEach(System.out::println);

        // Example 4: Consumer to print each element
        Consumer<String> printer = str -> System.out.println("Printing: " + str);
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(printer);

        // Example 5: Supplier to provide a random number
        Supplier<Double> randomNumberSupplier = () -> Math.random();
        System.out.println("Random number: " + randomNumberSupplier.get());

        // Example 6: Using lambda expression with a comparator
        List<String> fruits = Arrays.asList("Banana", "Apple", "Orange");
        fruits.sort((a, b) -> a.compareTo(b));
        System.out.println("Sorted fruits: " + fruits);

        // Example 7: Multi-line lambda expression
        Function<String, String> greet = name -> {
            String greeting = "Hello, ";
            return greeting + name;
        };
        System.out.println(greet.apply("World"));
    }
}
