
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

        // Example 2: Using Predicate to filter names that start with 'A'
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);

        // Example 3: Using Function to convert names to uppercase
        Function<String, String> toUpperCase = String::toUpperCase;
        List<String> upperCaseNames = names.stream()
                                            .map(toUpperCase)
                                            .toList();
        upperCaseNames.forEach(System.out::println);

        // Example 4: Using Runnable with a lambda expression
        Runnable task = () -> System.out.println("Task executed!");
        task.run();
        
        // Example 5: Using BiFunction to concatenate two strings
        var concat = (String a, String b) -> a + b;
        String result = concat.apply("Hello, ", "world!");
        System.out.println(result);
    }
}
