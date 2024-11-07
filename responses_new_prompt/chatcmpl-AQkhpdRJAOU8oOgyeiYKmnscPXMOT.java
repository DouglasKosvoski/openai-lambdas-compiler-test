
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Example 1: Basic Lambda Expression
        Runnable runnable = () -> System.out.println("Hello from a lambda!");
        runnable.run();

        // Example 2: Lambda Expression with Parameters
        Function<Integer, Integer> square = x -> x * x;
        System.out.println("Square of 5: " + square.apply(5));

        // Example 3: Using Predicate with Lambda
        Predicate<String> isLongerThanThreeChars = str -> str.length() > 3;
        System.out.println("Is 'Java' longer than three characters? " + isLongerThanThreeChars.test("Java"));

        // Example 4: Filtering a List with Lambda
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");
        List<String> filteredNames = names.stream()
                                           .filter(name -> name.startsWith("C"))
                                           .collect(Collectors.toList());
        System.out.println("Filtered names: " + filteredNames);

        // Example 5: Lambda to sort a list
        List<String> unsortedList = Arrays.asList("Banana", "Apple", "Cherry");
        List<String> sortedList = unsortedList.stream()
                                              .sorted((a, b) -> a.compareTo(b))
                                              .collect(Collectors.toList());
        System.out.println("Sorted list: " + sortedList);

        // Example 6: Using a Consumer with a Lambda
        names.forEach(name -> System.out.println("Name: " + name));

        // Example 7: Lambda Expression with Multiple Parameters
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println("Sum of 10 and 20: " + sum.apply(10, 20));
    }
}
