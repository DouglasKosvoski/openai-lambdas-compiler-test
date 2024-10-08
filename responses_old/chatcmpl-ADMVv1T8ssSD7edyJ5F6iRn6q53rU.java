
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Example 1: Simple lambda expression
        Runnable runnable = () -> System.out.println("Hello, World!");
        runnable.run();

        // Example 2: Lambda expression with parameters
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(n -> System.out.print(n + " "));

        // Example 3: Predicate with lambda expression
        Predicate<Integer> isEven = n -> n % 2 == 0;
        numbers.stream().filter(isEven).forEach(n -> System.out.print(n + " "));

        // Example 4: Sorting with lambda expression
        List<String> fruits = Arrays.asList("Banana", "Apple", "Cherry");
        fruits.sort((a, b) -> a.compareTo(b));
        fruits.forEach(fruit -> System.out.print(fruit + " "));

        // Example 5: Calculating square using lambda
        Function<Integer, Integer> square = x -> x * x;
        System.out.println("\nSquare of 4: " + square.apply(4));
    }
}
