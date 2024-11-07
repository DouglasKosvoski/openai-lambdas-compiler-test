
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Filtering with a lambda expression
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);

        // Example 2: Mapping with a lambda expression
        Function<String, String> toUpperCase = String::toUpperCase;
        List<String> upperCaseNames = names.stream().map(toUpperCase).toList();
        upperCaseNames.forEach(System.out::println);

        // Example 3: Consuming with a lambda expression
        Consumer<String> printName = System.out::println;
        names.forEach(printName);

        // Example 4: Counting with a lambda expression
        long count = names.stream().filter(name -> name.length() > 3).count();
        System.out.println("Count of names longer than 3 characters: " + count);
    }
}
