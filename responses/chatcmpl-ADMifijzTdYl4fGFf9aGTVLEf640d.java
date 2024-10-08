
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charles", "David");

        // Example 1: Using Consumer to print names
        Consumer<String> printName = name -> System.out.println(name);
        names.forEach(printName);

        // Example 2: Using Predicate to filter names
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(printName);

        // Example 3: Using Function to convert names to uppercase
        Function<String, String> toUpperCase = name -> name.toUpperCase();
        List<String> upperCaseNames = names.stream()
                                            .map(toUpperCase)
                                            .toList();
        upperCaseNames.forEach(printName);

        // Example 4: Using a lambda to sum an array of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, (subtotal, element) -> subtotal + element);
        System.out.println("Sum: " + sum);
    }
}
