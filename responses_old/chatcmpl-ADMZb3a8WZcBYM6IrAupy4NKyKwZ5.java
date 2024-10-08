
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Using lambda expression with Consumer
        Consumer<String> printName = name -> System.out.println(name);
        names.forEach(printName);

        // Example 2: Using lambda expression with Predicate
        Predicate<String> startsWithC = name -> name.startsWith("C");
        names.stream().filter(startsWithC).forEach(System.out::println);

        // Example 3: Using lambda expression with Function
        Function<String, Integer> nameLength = name -> name.length();
        names.stream().map(nameLength).forEach(System.out::println);

        // Example 4: Using lambda expression for sorting
        names.sort((name1, name2) -> name1.compareTo(name2));
        names.forEach(System.out::println);
    }
}
