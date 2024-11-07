
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // Example 1: Using a lambda expression to implement a functional interface
        Runnable runnable = () -> System.out.println("Hello from a lambda!");
        runnable.run();

        // Example 2: Using a Consumer to print elements of a list
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Consumer<String> printName = name -> System.out.println(name);
        names.forEach(printName);

        // Example 3: Using a Predicate to filter even numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Predicate<Integer> isEven = number -> number % 2 == 0;
        numbers.stream().filter(isEven).forEach(System.out::println);

        // Example 4: Using a Function to convert strings to their lengths
        Function<String, Integer> stringLength = str -> str.length();
        int length = stringLength.apply("Lambda");
        System.out.println("Length of 'Lambda': " + length);

        // Example 5: Using a Supplier to generate random numbers
        Supplier<Double> randomNumber = () -> Math.random();
        System.out.println("Random Number: " + randomNumber.get());

        // Example 6: Using a custom functional interface
        Comparable<String> stringComparator = (s1, s2) -> s1.length() - s2.length();
        System.out.println("Comparison result: " + stringComparator.compare("A", "Hello"));

        // Example 7: Chaining multiple lambda expressions
        List<Integer> multipliedNumbers = numbers.stream()
                .map(num -> num * 2)
                .filter(num -> num > 5)
                .toList();
        System.out.println("Multiplied and Filtered Numbers: " + multipliedNumbers);
    }
}
