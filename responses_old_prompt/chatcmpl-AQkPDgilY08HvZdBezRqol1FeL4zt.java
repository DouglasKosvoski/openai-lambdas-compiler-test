
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Using Predicate to filter names
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println);

        // Example 2: Using Function to convert names to uppercase
        List<String> upperCaseNames = names.stream()
                                            .map(String::toUpperCase)
                                            .toList();
        System.out.println(upperCaseNames);

        // Example 3: Using Consumer to print each name with a message
        Consumer<String> printWithMessage = name -> System.out.println("Name: " + name);
        names.forEach(printWithMessage);

        // Example 4: Using a lambda expression for sorting
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1);
        numbers.sort((a, b) -> b - a);
        System.out.println(numbers);
    }
}
