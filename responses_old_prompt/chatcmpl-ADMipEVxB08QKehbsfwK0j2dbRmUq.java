
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Example 1: Simple lambda expression
        Runnable runnable = () -> System.out.println("Hello, World!");
        runnable.run();

        // Example 2: Lambda with parameter
        Function<Integer, Integer> square = x -> x * x;
        System.out.println("Square of 5: " + square.apply(5));

        // Example 3: Predicate to check even numbers
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));

        // Example 4: Using lambda in a list
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println("Name: " + name));

        // Example 5: Sorting with lambda
        List<String> fruits = Arrays.asList("Banana", "Apple", "Mango");
        fruits.sort((a, b) -> a.compareTo(b));
        System.out.println("Sorted fruits: " + fruits);
    }
}
