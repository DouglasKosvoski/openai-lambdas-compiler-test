
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Example 1: Simple lambda expression
        Runnable simpleLambda = () -> System.out.println("Hello, Lambda!");
        simpleLambda.run();

        // Example 2: Lambda with parameters
        Function<Integer, Integer> square = x -> x * x;
        System.out.println("Square of 5: " + square.apply(5));

        // Example 3: Lambda with multiple parameters
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println("Sum of 10 and 20: " + sum.apply(10, 20));

        // Example 4: Lambda with Predicate
        Predicate<String> isEmpty = str -> str.isEmpty();
        System.out.println("Is string empty? " + isEmpty.test(""));

        // Example 5: Using Consumer
        Consumer<String> print = s -> System.out.println(s);
        print.accept("This is a Consumer example.");

        // Example 6: List with Lambda expressions
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println("Hello, " + name + "!"));

        // Example 7: Filtering with Stream and Lambda
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("Even numbers: " + evenNumbers);

        // Example 8: Custom functional interface
        MyFunctionalInterface reverse = str -> new StringBuilder(str).reverse().toString();
        System.out.println("Reversed 'Lambda': " + reverse.apply("Lambda"));
    }
}

@FunctionalInterface
interface MyFunctionalInterface {
    String apply(String str);
}
