
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Filtering names
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);

        // Example 2: Printing names
        Consumer<String> printName = name -> System.out.println("Name: " + name);
        names.forEach(printName);

        // Example 3: Converting names to uppercase
        Function<String, String> toUpperCase = String::toUpperCase;
        List<String> upperCaseNames = names.stream().map(toUpperCase).toList();
        upperCaseNames.forEach(System.out::println);

        // Example 4: Summing integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum);
    }
}
