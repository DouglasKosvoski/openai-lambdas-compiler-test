
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Using Predicate to filter names
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);

        // Example 2: Using Function to transform names
        Function<String, String> toUpperCase = String::toUpperCase;
        names.stream().map(toUpperCase).forEach(System.out::println);

        // Example 3: Using Consumer to print names
        Consumer<String> printName = System.out::println;
        names.forEach(printName);

        // Example 4: Using Runnable with lambda expression
        Runnable task = () -> System.out.println("Task is running");
        new Thread(task).start();

        // Example 5: Using binary operator to add two numbers
        java.util.function.BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(5, 10));
    }
}
