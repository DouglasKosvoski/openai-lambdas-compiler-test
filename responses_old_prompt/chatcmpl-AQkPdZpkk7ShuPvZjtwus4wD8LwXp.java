
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana");

        // Example 1: Filtering names that start with 'A'
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);

        // Example 2: Converting names to uppercase
        Function<String, String> toUpperCase = String::toUpperCase;
        names.stream().map(toUpperCase).forEach(System.out::println);

        // Example 3: Sum of an array using lambda expression
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum);

        // Example 4: Check if any name starts with 'C'
        boolean anyStartsWithC = names.stream().anyMatch(name -> name.startsWith("C"));
        System.out.println("Any name starts with C: " + anyStartsWithC);
    }
}
