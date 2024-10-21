
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Using a lambda expression to filter names
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(System.out::println);

        // Example 2: Using a lambda expression to find the length of the longest name
        int maxLength = names.stream()
                             .map(String::length)
                             .reduce(0, (a, b) -> Math.max(a, b));
        System.out.println("Max Length: " + maxLength);

        // Example 3: Using a lambda expression with a custom functional interface
        Predicate<String> startsWithB = s -> s.startsWith("B");
        System.out.println("Names starting with B: ");
        names.stream()
             .filter(startsWithB)
             .forEach(System.out::println);

        // Example 4: Using lambda expressions to sort names
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1);
        numbers.sort((a, b) -> a.compareTo(b));
        System.out.println("Sorted Numbers: " + numbers);
    }
}
