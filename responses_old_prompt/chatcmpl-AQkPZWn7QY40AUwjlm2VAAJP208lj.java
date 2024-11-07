
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Using lambda with Predicate
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);
        
        // Example 2: Using lambda with Function
        Function<String, Integer> stringLength = String::length;
        names.stream().map(stringLength).forEach(System.out::println);
        
        // Example 3: Using lambda with Consumer
        Consumer<String> printUpperCase = name -> System.out.println(name.toUpperCase());
        names.forEach(printUpperCase);

        // Example 4: Using lambda with sorting
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1);
        numbers.sort((a, b) -> b - a);
        numbers.forEach(System.out::println);
        
        // Example 5: Using lambda in a custom interface
        Computable add = (a, b) -> a + b;
        System.out.println(add.compute(5, 3));
    }

    interface Computable {
        int compute(int a, int b);
    }
}
