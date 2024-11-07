
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Example 1: Simple lambda for addition
        Function<Integer, Integer> addFive = x -> x + 5;
        System.out.println(addFive.apply(10)); // Output: 15

        // Example 2: Using lambda with Collections sort
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Daniel");
        names.sort((a, b) -> a.length() - b.length());
        names.forEach(System.out::println);

        // Example 3: Predicate to filter even numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Predicate<Integer> isEven = n -> n % 2 == 0;
        numbers.stream().filter(isEven).forEach(System.out::println);

        // Example 4: Using lambda with method references
        List<String> uppercased = Arrays.asList("hello", "world").stream()
            .map(String::toUpperCase)
            .toList();
        uppercased.forEach(System.out::println);

        // Example 5: Consumer to print items
        List<Integer> items = Arrays.asList(1, 2, 3, 4, 5);
        items.forEach(item -> System.out.println("Item: " + item));

        // Example 6: Sorting a list of integers in descending order
        List<Integer> integers = Arrays.asList(5, 1, 4, 2, 3);
        integers.sort(Comparator.reverseOrder());
        integers.forEach(System.out::println);

        // Example 7: Using a lambda to calculate factorial
        Function<Integer, Integer> factorial = (Integer n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };
        System.out.println(factorial.apply(5)); // Output: 120
    }
}
