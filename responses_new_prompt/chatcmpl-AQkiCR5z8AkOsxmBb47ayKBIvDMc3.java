
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Example 1: Using a lambda expression with a Runnable
        Runnable runnable = () -> System.out.println("Hello from a lambda Runnable!");
        new Thread(runnable).start();

        // Example 2: Using a lambda expression with a Consumer
        Consumer<String> greet = name -> System.out.println("Hello, " + name + "!");
        greet.accept("Alice");

        // Example 3: Using a lambda expression with a Predicate
        Predicate<String> isLongerThanThree = str -> str.length() > 3;
        System.out.println(isLongerThanThree.test("Java")); // true
        System.out.println(isLongerThanThree.test("C")); // false

        // Example 4: Using a lambda expression with a Function
        Function<Integer, Integer> square = x -> x * x;
        System.out.println(square.apply(5)); // 25

        // Example 5: Filtering a list with a lambda expression
        List<String> names = Arrays.asList("Jack", "Jill", "John", "Alice");
        names.stream()
                .filter(name -> name.startsWith("J"))
                .forEach(System.out::println); // Jack, Jill, John

        // Example 6: Sorting a list with a lambda expression
        List<String> fruits = Arrays.asList("Banana", "Apple", "Mango");
        fruits.sort((a, b) -> a.compareTo(b));
        fruits.forEach(System.out::println); // Apple, Banana, Mango

        // Example 7: Using lambda in a method reference
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(System.out::println); // 1, 2, 3, 4, 5
    }
}
