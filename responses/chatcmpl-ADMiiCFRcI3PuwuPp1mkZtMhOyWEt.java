
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Example 1: Filtering with lambda expression
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);

        // Example 2: Using lambda with Consumer
        Consumer<String> printName = name -> System.out.println(name);
        printName.accept("Eve");

        // Example 3: Using lambda with Function
        Function<Integer, Integer> square = x -> x * x;
        System.out.println(square.apply(5));

        // Example 4: Using lambda with Predicate
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(10));
        
        // Example 5: Creating a Runnable with lambda
        Runnable runnable = () -> System.out.println("Running in a thread");
        new Thread(runnable).start();
    }
}
