
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        
        // Example 1: Using a lambda expression with Consumer
        Consumer<String> greet = name -> System.out.println("Hello, " + name + "!");
        names.forEach(greet);

        // Example 2: Using a lambda expression with Function
        Function<String, Integer> nameLength = name -> name.length();
        names.stream()
             .map(nameLength)
             .forEach(length -> System.out.println("Length: " + length));

        // Example 3: Using a lambda expression with Predicate
        Predicate<String> startsWithA = name -> name.startsWith("A");
        long count = names.stream()
                          .filter(startsWithA)
                          .count();
        System.out.println("Count of names starting with A: " + count);
    }
}
