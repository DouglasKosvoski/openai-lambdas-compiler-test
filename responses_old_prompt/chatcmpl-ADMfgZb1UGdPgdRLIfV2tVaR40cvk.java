
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Example 1: Using a lambda expression to iterate over a list
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println(name));

        // Example 2: Using a lambda expression to filter a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(n -> System.out.println(n));

        // Example 3: Using a lambda expression as a Function
        Function<Integer, String> intToString = num -> "Number: " + num;
        System.out.println(intToString.apply(10));

        // Example 4: Using a lambda expression as a Predicate
        Predicate<String> isLongerThan3 = str -> str.length() > 3;
        System.out.println(isLongerThan3.test("Hello"));

        // Example 5: Using a lambda expression with Consumer
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("hello world");
    }
}
