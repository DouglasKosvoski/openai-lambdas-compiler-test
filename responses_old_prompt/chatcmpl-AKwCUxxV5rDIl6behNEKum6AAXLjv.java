
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        // Example 1: Using lambda with Predicate
        Predicate<Integer> isEven = n -> n % 2 == 0;
        numbers.stream().filter(isEven).forEach(System.out::println);

        // Example 2: Using lambda with Function
        Function<Integer, String> toString = n -> "Number: " + n;
        numbers.stream().map(toString).forEach(System.out::println);

        // Example 3: Using lambda with Consumer
        Consumer<Integer> printSquare = n -> System.out.println(n * n);
        numbers.forEach(printSquare);

        // Example 4: Sorting with a lambda expression
        List<String> names = new ArrayList<>(List.of("Alice", "Bob", "Charlie"));
        names.sort((s1, s2) -> s1.compareTo(s2));
        names.forEach(System.out::println);
    }
}
