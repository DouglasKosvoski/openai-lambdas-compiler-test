
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Simple lambda expression
        names.forEach(name -> System.out.println(name));

        // Example 2: Lambda expression with a Consumer
        Consumer<String> printName = name -> System.out.println("Hello, " + name);
        names.forEach(printName);

        // Example 3: Lambda expression with a Predicate
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);

        // Example 4: Lambda expression for a Runnable
        Runnable task = () -> System.out.println("Running task in a thread.");
        new Thread(task).start();

        // Example 5: Lambda expression with a Comparator
        names.sort((s1, s2) -> s1.length() - s2.length());
        names.forEach(System.out::println);
    }
}
