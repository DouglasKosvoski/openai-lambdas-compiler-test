
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Example 1: Simple lambda expression with Runnable interface
        Runnable task = () -> System.out.println("Hello from a thread!");
        new Thread(task).start();

        // Example 2: Lambda expression for a list of strings
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println("Name: " + name));

        // Example 3: Lambda expression for a Predicate
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));

        // Example 4: Lambda expression that returns a value (Function)
        Function<String, Integer> stringLength = str -> str.length();
        System.out.println("Length of 'Lambda': " + stringLength.apply("Lambda"));

        // Example 5: Using lambda with List's sort method
        List<String> fruits = Arrays.asList("Banana", "Apple", "Orange");
        fruits.sort((a, b) -> a.compareTo(b));
        System.out.println("Sorted fruits: " + fruits);

        // Example 6: Creating a Consumer lambda expression
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("hello");

        // Example 7: Lambda expression with multiple arguments
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("Sum of 5 and 3: " + add.apply(5, 3));

        // Example 8: Filtering a list with a lambda expression
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
                .filter(n -> n > 2)
                .forEach(n -> System.out.println("Filtered number: " + n));
    }
}
