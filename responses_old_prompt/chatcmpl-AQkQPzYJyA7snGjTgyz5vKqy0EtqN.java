
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Example 1: Using Consumer
        Consumer<String> printName = name -> System.out.println(name);
        names.forEach(printName);

        // Example 2: Using Predicate
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);

        // Example 3: Using Function
        Function<String, String> toUpperCase = name -> name.toUpperCase();
        List<String> upperNames = names.stream()
                                        .map(toUpperCase)
                                        .toList();
        upperNames.forEach(System.out::println);

        // Example 4: Using BiFunction
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        Function<Integer, Integer> square = n -> n * n;
        numbers.stream().map(square).forEach(System.out::println);
    }
}
