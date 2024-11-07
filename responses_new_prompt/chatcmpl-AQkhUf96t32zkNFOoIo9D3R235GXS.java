
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Example 1: Simple lambda to print a message
        Consumer<String> printer = message -> System.out.println(message);
        printer.accept("Hello, Lambda!");

        // Example 2: Lambda to double a number
        Function<Integer, Integer> doubler = num -> num * 2;
        System.out.println("Doubled: " + doubler.apply(5));

        // Example 3: Lambda to check if a number is even
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));

        // Example 4: Lambda for filtering even numbers from a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream().filter(isEven).collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        // Example 5: Lambda to sort a list of strings by their length
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Christina");
        List<String> sortedByLength = names.stream()
                                             .sorted((a, b) -> Integer.compare(a.length(), b.length()))
                                             .collect(Collectors.toList());
        System.out.println("Sorted by length: " + sortedByLength);

        // Example 6: Lambda expression with multiple statements
        Function<Integer, String> numberDescription = num -> {
            String description = (num % 2 == 0) ? "Even" : "Odd";
            return description + " number: " + num;
        };
        System.out.println(numberDescription.apply(7));

        // Example 7: Using a lambda in a map operation
        List<Integer> squaredNumbers = numbers.stream().map(num -> num * num).collect(Collectors.toList());
        System.out.println("Squared numbers: " + squaredNumbers);
    }
}
