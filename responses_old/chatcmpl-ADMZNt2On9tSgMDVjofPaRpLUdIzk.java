
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Example 1: Simple expression
        Runnable runnable = () -> System.out.println("Hello, Lambda!");
        runnable.run();

        // Example 2: With parameters
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("Sum: " + add.apply(5, 3));

        // Example 3: Filtering a list
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
        List<String> filteredNames = names.stream()
            .filter(name -> name.startsWith("A"))
            .collect(Collectors.toList());
        System.out.println("Filtered Names: " + filteredNames);

        // Example 4: Sorting with a lambda
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1);
        List<Integer> sortedNumbers = numbers.stream()
            .sorted((a, b) -> a - b)
            .collect(Collectors.toList());
        System.out.println("Sorted Numbers: " + sortedNumbers);

        // Example 5: Using Consumer
        Consumer<String> printConsumer = s -> System.out.println(s);
        printConsumer.accept("Consuming this string!");

        // Example 6: Using Predicate
        Predicate<String> isLongerThan3 = s -> s.length() > 3;
        System.out.println("Is 'Java' longer than 3? " + isLongerThan3.test("Java"));
    }
}
