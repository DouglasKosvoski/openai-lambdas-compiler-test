
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");

        // Example 1: Using a Consumer to print names
        Consumer<String> printName = name -> System.out.println(name);
        names.forEach(printName);

        // Example 2: Using a Predicate to filter names
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);

        // Example 3: Using a Function to convert names to upper case
        Function<String, String> toUpperCase = String::toUpperCase;
        List<String> upperCaseNames = names.stream().map(toUpperCase).toList();
        upperCaseNames.forEach(System.out::println);
        
        // Example 4: Using a BinaryOperator to concatenate two strings
        var concatenate = (String a, String b) -> a + " " + b;
        System.out.println(concatenate.apply("Hello", "World"));
    }
}
