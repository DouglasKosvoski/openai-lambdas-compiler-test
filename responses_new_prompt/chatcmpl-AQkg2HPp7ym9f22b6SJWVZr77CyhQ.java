
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        
        // Example 1: Using a lambda expression as a Consumer
        Consumer<String> stringPrinter = s -> System.out.println(s);
        stringPrinter.accept("Hello, Lambda!");

        // Example 2: Using a lambda expression as a Function
        Function<Integer, String> numberToString = num -> "Number: " + num;
        System.out.println(numberToString.apply(5));

        // Example 3: Using a lambda expression as a Predicate
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(10)); // true
        System.out.println(isEven.test(7));  // false

        // Example 4: Using lambda expressions with a List
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println(name.toUpperCase()));
        
        // Example 5: Using lambda expressions with sorting
        List<String> fruits = Arrays.asList("Banana", "Apple", "Cherry");
        fruits.sort((fruit1, fruit2) -> fruit1.compareTo(fruit2));
        System.out.println(fruits);

        // Example 6: Using a BiFunction
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println(sum.apply(10, 20));

        // Example 7: Creating a thread using a lambda expression
        Runnable task = () -> System.out.println("Running in a thread");
        new Thread(task).start();
    }
}
