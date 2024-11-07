
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Example 1: Using a lambda to filter a list of strings
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);
        
        // Example 2: Using a lambda to perform an action on each element
        Consumer<String> print = s -> System.out.println(s);
        names.forEach(print);
        
        // Example 3: Using a lambda to transform data
        Function<String, String> toUpperCase = s -> s.toUpperCase();
        List<String> upperCaseNames = Arrays.asList("alice", "bob", "charlie").stream()
            .map(toUpperCase)
            .toList();
        upperCaseNames.forEach(System.out::println);
        
        // Example 4: Using a lambda for conditional logic
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(4)); // true
        System.out.println(isEven.test(5)); // false
    }
}
