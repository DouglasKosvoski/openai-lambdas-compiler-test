
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Example 1: Simple lambda expression
        Runnable simpleLambda = () -> System.out.println("Hello from a simple lambda!");
        simpleLambda.run();

        // Example 2: Lambda with parameters
        Function<Integer, Integer> square = x -> x * x;
        System.out.println("Square of 5: " + square.apply(5));

        // Example 3: Lambda with Predicate
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Daniel");
        Predicate<String> startsWithA = name -> name.startsWith("A");
        List<String> filteredNames = names.stream()
                                           .filter(startsWithA)
                                           .collect(Collectors.toList());
        System.out.println("Names starting with A: " + filteredNames);

        // Example 4: Lambda with Consumer
        Consumer<String> printName = name -> System.out.println("Name: " + name);
        names.forEach(printName);

        // Example 5: Lambda in sorting
        List<Integer> numbers = Arrays.asList(5, 3, 4, 1, 2);
        numbers.sort((a, b) -> b - a);
        System.out.println("Sorted numbers in descending order: " + numbers);

        // Example 6: Using multiple parameters in a lambda
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("Sum of 10 and 20: " + add.apply(10, 20));

        // Example 7: Method reference as a lambda
        List<String> upperCaseNames = names.stream()
                                            .map(String::toUpperCase)
                                            .collect(Collectors.toList());
        System.out.println("Names in uppercase: " + upperCaseNames);

        // Example 8: Chained Lambda Expressions
        List<String> modifiedNames = names.stream()
                                            .filter(name -> name.length() > 3)
                                            .map(String::toUpperCase)
                                            .collect(Collectors.toList());
        System.out.println("Names longer than 3 characters in uppercase: " + modifiedNames);
    }
}
