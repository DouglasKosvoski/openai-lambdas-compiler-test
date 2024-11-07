
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Using Consumer to print names
        Consumer<String> printName = name -> System.out.println(name);
        names.forEach(printName);

        // Example 2: Using Predicate to filter names starting with 'C'
        Predicate<String> startsWithC = name -> name.startsWith("C");
        names.stream().filter(startsWithC).forEach(System.out::println);

        // Example 3: Using Function to convert names to uppercase
        Function<String, String> toUpperCase = String::toUpperCase;
        List<String> upperCaseNames = names.stream()
                                             .map(toUpperCase)
                                             .toList();
        upperCaseNames.forEach(System.out::println);
        
        // Example 4: Using a simple lambda expression for addition
        Function<Integer, Function<Integer, Integer>> add = 
            x -> y -> x + y;
        System.out.println(add.apply(5).apply(10));
    }
}
