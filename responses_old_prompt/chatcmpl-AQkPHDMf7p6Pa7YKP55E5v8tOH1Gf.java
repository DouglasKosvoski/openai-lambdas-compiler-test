
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Using lambda to filter names
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);

        // Example 2: Using lambda to convert names to uppercase
        Function<String, String> toUpperCase = name -> name.toUpperCase();
        List<String> upperCaseNames = names.stream().map(toUpperCase).toList();
        upperCaseNames.forEach(System.out::println);

        // Example 3: Using lambda as a Consumer to print names
        Consumer<String> printName = name -> System.out.println("Name: " + name);
        names.forEach(printName);

        // Example 4: Using lambda to sort names
        names.stream().sorted((a, b) -> a.length() - b.length()).forEach(System.out::println);
    }
}
