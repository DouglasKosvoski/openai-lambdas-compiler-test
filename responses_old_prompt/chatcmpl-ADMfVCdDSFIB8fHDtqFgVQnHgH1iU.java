
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Using lambda with a forEach
        names.forEach(name -> System.out.println(name));

        // Example 2: Filtering with a lambda expression
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);

        // Example 3: Transforming values with a lambda expression
        Function<String, String> toUpperCase = name -> name.toUpperCase();
        List<String> upperNames = names.stream()
                                       .map(toUpperCase)
                                       .toList();
        upperNames.forEach(System.out::println);

        // Example 4: Summing with a lambda expression
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum: " + sum);
        
        // Example 5: Using lambda with a Comparator
        names.sort((a, b) -> b.compareTo(a));
        names.forEach(System.out::println);
    }
}
