
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Example 1: Basic Lambda Expression
        Runnable runnable = () -> System.out.println("Hello, World!");
        runnable.run();

        // Example 2: Lambda with Parameters
        Consumer<String> printer = message -> System.out.println(message);
        printer.accept("This is a lambda expression with parameters.");

        // Example 3: Lambda for filtering a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();

        // Example 4: Lambda expression with return value
        Function<Integer, Integer> square = x -> x * x;
        System.out.println("Square of 5: " + square.apply(5));

        // Example 5: Using Predicate for condition checking
        Predicate<String> isEmpty = str -> str.isEmpty();
        System.out.println("Is string empty? " + isEmpty.test(""));

        // Example 6: Method reference with lambda behavior
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println(name.toUpperCase()));

        // Example 7: Using lambda to create a custom comparator
        List<String> fruits = Arrays.asList("Banana", "Apple", "Cherry");
        fruits.sort((a, b) -> a.compareTo(b));
        System.out.println(fruits);
        
        // Example 8: Complex Lambda expression
        List<String> list = Arrays.asList("apple", "banana", "kiwi", "mango");
        List<String> filtered = list.stream()
                                     .filter(s -> s.startsWith("a") || s.startsWith("b"))
                                     .map(String::toUpperCase)
                                     .toList();
        System.out.println(filtered);
    }
}
