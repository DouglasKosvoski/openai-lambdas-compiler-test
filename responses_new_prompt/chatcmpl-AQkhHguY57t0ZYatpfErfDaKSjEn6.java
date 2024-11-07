
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Example 1: Using a lambda expression with Predicate
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(4)); // true
        System.out.println(isEven.test(5)); // false

        // Example 2: Using a lambda expression with Function
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println(stringLength.apply("Hello")); // 5

        // Example 3: Using a lambda expression with Consumer
        Consumer<String> print = s -> System.out.println(s);
        print.accept("Hello, World!"); // Hello, World!

        // Example 4: Using lambda with forEach
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println(name));

        // Example 5: Using lambdas to sort a list
        List<String> cities = Arrays.asList("Tokyo", "New York", "London", "Paris");
        cities.sort((s1, s2) -> s1.compareTo(s2));
        cities.forEach(city -> System.out.println(city));

        // Example 6: Using a multi-line lambda expression
        Function<Integer, String> numberToString = (Integer number) -> {
            if (number == 0) return "Zero";
            else if (number == 1) return "One";
            else return "Number: " + number;
        };
        System.out.println(numberToString.apply(2)); // Number: 2

        // Example 7: Lambda expression for a runnable
        Runnable runnable = () -> System.out.println("Running in a separate thread!");
        new Thread(runnable).start();

        // Example 8: Combining predicates
        Predicate<Integer> isOdd = n -> n % 2 != 0;
        Predicate<Integer> isPositive = n -> n > 0;
        Predicate<Integer> isPositiveOdd = isOdd.and(isPositive);
        System.out.println(isPositiveOdd.test(3)); // true
        System.out.println(isPositiveOdd.test(-3)); // false
        System.out.println(isPositiveOdd.test(2)); // false
    }
}
