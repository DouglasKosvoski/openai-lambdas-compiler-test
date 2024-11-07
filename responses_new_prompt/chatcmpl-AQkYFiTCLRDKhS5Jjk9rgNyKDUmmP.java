
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Example 1: Basic lambda expression
        Runnable runnable = () -> System.out.println("Hello from a lambda!");
        runnable.run();

        // Example 2: Lambda expression with a parameter
        Function<Integer, Integer> square = x -> x * x;
        System.out.println("Square of 4: " + square.apply(4));

        // Example 3: Lambda expression with multiple parameters
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println("Sum of 5 and 10: " + sum.apply(5, 10));

        // Example 4: Filtering a list
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String> filteredNames = names.stream()
                                           .filter(name -> name.startsWith("B"))
                                           .collect(Collectors.toList());
        System.out.println("Names starting with B: " + filteredNames);

        // Example 5: Sorting a list using a lambda expression
        List<String> sortedNames = names.stream()
                                         .sorted((name1, name2) -> name1.compareTo(name2))
                                         .collect(Collectors.toList());
        System.out.println("Sorted names: " + sortedNames);

        // Example 6: Using lambda to implement a consumer
        Consumer<String> printer = str -> System.out.println(str);
        printer.accept("This is a message from a Consumer!");

        // Example 7: Creating a comparator using lambda
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 4);
        List<Integer> sortedNumbers = numbers.stream()
                                              .sorted((n1, n2) -> n1 - n2)
                                              .collect(Collectors.toList());
        System.out.println("Sorted numbers: " + sortedNumbers);

        // Example 8: Using method reference with lambda
        List<String> uppercasedNames = names.stream()
                                             .map(String::toUpperCase)
                                             .collect(Collectors.toList());
        System.out.println("Uppercased names: " + uppercasedNames);
    }
}
