
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Example 1: Simple lambda expression

        Runnable runnable = () -> System.out.println("Hello from runnable!");
        runnable.run();

        // Example 2: Lambda expression with parameters

        Function<Integer, Integer> square = x -> x * x;
        System.out.println("Square of 5: " + square.apply(5));

        // Example 3: Using lambda with Collections

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println("Sorted names: " + names);

        // Example 4: Lambda expression with multiple parameters

        Comparator<String> comparator = (s1, s2) -> s1.length() - s2.length();
        List<String> values = Arrays.asList("short", "longer", "tiny");
        Collections.sort(values, comparator);
        System.out.println("Sorted by length: " + values);

        // Example 5: Using lambda with Predicate

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Predicate<Integer> isEven = num -> num % 2 == 0;
        numbers.stream().filter(isEven).forEach(num -> System.out.println("Even number: " + num));

        // Example 6: Lambda expression for a custom functional interface

        interface Greeting {
            void greet(String name);
        }

        Greeting greeting = name -> System.out.println("Hello " + name);
        greeting.greet("World");

        // Example 7: Using lambda for map and reduce

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int sum = list.stream().map(x -> x * x).reduce(0, Integer::sum);
        System.out.println("Sum of squares: " + sum);
    }
}
