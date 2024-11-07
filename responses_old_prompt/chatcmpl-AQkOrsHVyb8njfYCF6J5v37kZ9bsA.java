
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Example 1: Simple lambda expression
        Runnable runnable = () -> System.out.println("Running a task");
        runnable.run();

        // Example 2: Lambda expression with parameters
        Consumer<String> printer = str -> System.out.println(str);
        printer.accept("Hello, Lambda!");

        // Example 3: Lambda expression for filtering
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = new ArrayList<>();
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(evenNumbers::add);
        System.out.println(evenNumbers);

        // Example 4: Lambda expression for mapping
        Function<Integer, String> toStringFunction = n -> "Number: " + n;
        numbers.stream()
               .map(toStringFunction)
               .forEach(System.out::println);

        // Example 5: Lambda expression for custom sorting
        List<String> names = new ArrayList<>(List.of("John", "Alice", "Bob"));
        names.sort((s1, s2) -> s1.length() - s2.length());
        System.out.println(names);
    }
}
