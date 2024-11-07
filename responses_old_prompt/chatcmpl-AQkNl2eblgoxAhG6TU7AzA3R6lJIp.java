
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Using Consumer to print names
        Consumer<String> printName = name -> System.out.println(name);
        names.forEach(printName);

        // Example 2: Using Predicate to filter names
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);

        // Example 3: Using Function to convert names to uppercase
        Function<String, String> toUpperCase = name -> name.toUpperCase();
        names.stream().map(toUpperCase).forEach(System.out::println);

        // Example 4: Using a sorted method with a lambda expression
        names.stream().sorted((s1, s2) -> s1.compareTo(s2)).forEach(System.out::println);
    }
}
