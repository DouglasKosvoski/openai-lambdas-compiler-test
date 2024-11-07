
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Using Lambda Expression with Predicate
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);

        // Example 2: Using Lambda Expression with Function
        Function<String, Integer> nameLength = name -> name.length();
        names.stream().map(nameLength).forEach(System.out::println);

        // Example 3: Using Lambda Expression with Consumer
        Consumer<String> printUpperCase = name -> System.out.println(name.toUpperCase());
        names.forEach(printUpperCase);

        // Example 4: Using Lambda Expression for sorting
        List<String> sortedNames = names.stream().sorted((a, b) -> b.compareTo(a)).toList();
        sortedNames.forEach(System.out::println);
    }
}
