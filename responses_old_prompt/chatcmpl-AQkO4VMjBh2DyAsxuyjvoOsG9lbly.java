
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Example 1: Using a lambda expression with Consumer
        Consumer<String> greet = name -> System.out.println("Hello, " + name);
        names.forEach(greet);

        // Example 2: Using a lambda expression with Function
        Function<String, Integer> stringLength = str -> str.length();
        names.forEach(name -> System.out.println(name + " has length: " + stringLength.apply(name)));

        // Example 3: Using a lambda expression with Predicate
        Predicate<String> startsWithA = name -> name.startsWith("A");
        long count = names.stream().filter(startsWithA).count();
        System.out.println("Names starting with A: " + count);
        
        // Example 4: Using a lambda expression for sorting
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1);
        numbers.sort((a, b) -> a - b);
        System.out.println("Sorted numbers: " + numbers);
    }
}
