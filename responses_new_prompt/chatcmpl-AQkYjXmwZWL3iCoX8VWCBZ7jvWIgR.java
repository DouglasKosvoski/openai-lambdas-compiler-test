
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Example 1: Basic lambda expression
        Consumer<String> printer = (s) -> System.out.println(s);
        printer.accept("Hello, World!");

        // Example 2: Lambda with multiple parameters
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println("Sum: " + sum.apply(5, 10));

        // Example 3: Using Predicate to filter a list
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        Predicate<String> startsWithC = (name) -> name.startsWith("C");
        names.stream().filter(startsWithC).forEach(printer);

        // Example 4: Function to convert strings to their lengths
        Function<String, Integer> stringLength = (s) -> s.length();
        System.out.println("Length of 'Hello': " + stringLength.apply("Hello"));

        // Example 5: Using method reference with lambda
        List<String> uppercasedNames = names.stream()
                                             .map(String::toUpperCase)
                                             .toList();
        uppercasedNames.forEach(printer);

        // Example 6: Chaining lambdas
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sumOfSquares = numbers.stream()
                                  .map(n -> n * n)
                                  .reduce(0, Integer::sum);
        System.out.println("Sum of squares: " + sumOfSquares);
    }
}
