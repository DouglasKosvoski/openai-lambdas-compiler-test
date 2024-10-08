
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Using a lambda expression for filtering
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(name -> System.out.println(name));

        // Example 2: Using a lambda expression for transformation
        List<Integer> nameLengths = names.stream()
                .map(name -> name.length())
                .toList();
        System.out.println(nameLengths);

        // Example 3: Using a lambda expression with a custom functional interface
        Consumer<String> greet = name -> System.out.println("Hello, " + name);
        names.forEach(greet);

        // Example 4: Using a lambda expression as a Predicate
        Predicate<String> isShortName = name -> name.length() <= 4;
        names.stream()
                .filter(isShortName)
                .forEach(System.out::println);
        
        // Example 5: Using a lambda expression with a Function
        Function<String, String> toUpperCase = str -> str.toUpperCase();
        names.stream()
                .map(toUpperCase)
                .forEach(System.out::println);
    }
}
