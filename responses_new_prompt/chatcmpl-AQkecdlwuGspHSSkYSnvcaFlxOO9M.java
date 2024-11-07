
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Example 1: Simple lambda expression that prints a message
        Consumer<String> printMessage = message -> System.out.println(message);
        printMessage.accept("Hello from simple lambda!");

        // Example 2: Lambda expression with a parameter to square a number
        Function<Integer, Integer> square = number -> number * number;
        System.out.println("Square of 5: " + square.apply(5));

        // Example 3: Predicate to check if a number is even
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));

        // Example 4: Using lambda expression in a list sorting context
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> sortedNames = names.stream()
                .sorted((name1, name2) -> name1.compareTo(name2))
                .collect(Collectors.toList());
        System.out.println("Sorted names: " + sortedNames);

        // Example 5: Filtering a list with a lambda expression
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream()
                .filter(isEven)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        // Example 6: Using lambda expression to concatenate strings
        Function<String, String> greet = name -> "Hello, " + name + "!";
        System.out.println(greet.apply("World"));

        // Example 7: Chaining lambda expressions
        Function<Integer, Integer> addFive = number -> number + 5;
        Function<Integer, Integer> multiplyByTwo = number -> number * 2;
        int result = multiplyByTwo.apply(addFive.apply(10));
        System.out.println("Result after chaining: " + result);
    }
}
