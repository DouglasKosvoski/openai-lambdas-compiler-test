
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana");

        // Example 1: Using Consumer to print names
        Consumer<String> printName = name -> System.out.println(name);
        names.forEach(printName);

        // Example 2: Using Predicate to filter names
        Predicate<String> startsWithC = name -> name.startsWith("C");
        names.stream().filter(startsWithC).forEach(printName);

        // Example 3: Using Function to convert names to uppercase
        Function<String, String> toUpperCase = name -> name.toUpperCase();
        List<String> upperCaseNames = names.stream()
                                            .map(toUpperCase)
                                            .toList();
        upperCaseNames.forEach(printName);

        // Example 4: Using lambda expression to calculate square of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
               .map(n -> n * n)
               .forEach(System.out::println);
    }
}
