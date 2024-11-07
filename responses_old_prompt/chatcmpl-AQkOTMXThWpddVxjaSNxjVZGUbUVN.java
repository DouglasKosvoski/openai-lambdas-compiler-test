
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Using Consumer
        Consumer<String> greet = name -> System.out.println("Hello, " + name + "!");
        names.forEach(greet);

        // Example 2: Using Predicate
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);

        // Example 3: Using Function
        Function<String, String> toUpperCase = String::toUpperCase;
        List<String> upperCaseNames = names.stream().map(toUpperCase).toList();
        upperCaseNames.forEach(System.out::println);

        // Example 4: Using BiFunction
        Function<Integer, Function<Integer, Integer>> add = x -> y -> x + y;
        System.out.println(add.apply(5).apply(10));
    }
}
