
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        
        // Example 1: Simple lambda expression with Runnable
        Runnable runnable = () -> System.out.println("Hello from Runnable!");
        runnable.run();

        // Example 2: Lambda expression with function parameter
        Function<Integer, Integer> square = x -> x * x;
        System.out.println("Square of 5: " + square.apply(5));

        // Example 3: Lambda expression with Predicate
        Predicate<String> isNotEmpty = s -> !s.isEmpty();
        System.out.println("Is 'hello' not empty? " + isNotEmpty.test("hello"));

        // Example 4: Lambda expression with Consumer
        Consumer<String> printUpperCase = s -> System.out.println(s.toUpperCase());
        printUpperCase.accept("hello world");

        // Example 5: Using lambda with filter
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        names.stream().filter(name -> name.startsWith("C"))
             .forEach(System.out::println);

        // Example 6: Lambda expression for sorting
        List<String> fruits = Arrays.asList("banana", "apple", "cherry", "date");
        fruits.sort((a, b) -> a.compareTo(b));
        System.out.println("Sorted fruits: " + fruits);

        // Example 7: Multi-line lambda expression
        Function<String, String> reverseString = s -> {
            StringBuilder reversed = new StringBuilder(s);
            return reversed.reverse().toString();
        };
        System.out.println("Reversed 'hello': " + reverseString.apply("hello"));

        // Example 8: Using lambda in custom functional interface
        MyFunctionalInterface myFunc = (a, b) -> a + b;
        System.out.println("Addition: " + myFunc.operate(10, 20));
    }

    @FunctionalInterface
    interface MyFunctionalInterface {
        int operate(int a, int b);
    }
}
