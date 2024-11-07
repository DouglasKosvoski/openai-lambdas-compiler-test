
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Using Predicate to filter names
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);

        // Example 2: Using Function to transform names to uppercase
        Function<String, String> toUpperCase = String::toUpperCase;
        List<String> upperCaseNames = names.stream().map(toUpperCase).toList();
        upperCaseNames.forEach(System.out::println);

        // Example 3: Using Consumer to print names with a greeting
        Consumer<String> greet = name -> System.out.println("Hello, " + name + "!");
        names.forEach(greet);

        // Example 4: Using a lambda expression in a custom functional interface
        MyFunctionalInterface myFunction = (a, b) -> a + b;
        int result = myFunction.add(5, 10);
        System.out.println(result);

        // Example 5: Sorting using a lambda expression
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1);
        numbers.sort((n1, n2) -> n1.compareTo(n2));
        numbers.forEach(System.out::println);
    }

    @FunctionalInterface
    interface MyFunctionalInterface {
        int add(int a, int b);
    }
}
