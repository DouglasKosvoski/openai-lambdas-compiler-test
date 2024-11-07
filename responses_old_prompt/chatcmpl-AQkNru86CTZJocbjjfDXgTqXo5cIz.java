
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Example 1: Using Consumer to print names
        Consumer<String> printName = name -> System.out.println(name);
        names.forEach(printName);

        // Example 2: Using Predicate to filter names
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);

        // Example 3: Using Function to convert names to uppercase
        Function<String, String> toUpperCase = String::toUpperCase;
        List<String> upperNames = names.stream().map(toUpperCase).toList();
        upperNames.forEach(System.out::println);

        // Example 4: Using a lambda to sum up numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, (total, number) -> total + number);
        System.out.println("Sum: " + sum);
    }
}
