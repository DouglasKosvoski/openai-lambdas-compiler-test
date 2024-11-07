
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Using Consumer to print names
        Consumer<String> printName = name -> System.out.println(name);
        names.forEach(printName);

        // Example 2: Using Predicate to filter names
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);

        // Example 3: Using Function to get lengths of names
        Function<String, Integer> nameLength = name -> name.length();
        names.stream().map(nameLength).forEach(System.out::println);

        // Example 4: Using Lambda to sort names by length
        names.sort((a, b) -> Integer.compare(a.length(), b.length()));
        names.forEach(System.out::println);

        // Example 5: Using method reference to display names
        names.forEach(System.out::println);
    }
}
