
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // 1. Using lambda with Predicate
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);

        // 2. Using lambda with Consumer
        Consumer<String> printUpperCase = name -> System.out.println(name.toUpperCase());
        names.forEach(printUpperCase);

        // 3. Using lambda with Comparator
        List<Integer> numbers = Arrays.asList(5, 3, 9, 1);
        numbers.sort((a, b) -> b - a);
        System.out.println(numbers);

        // 4. Using lambda with Runnable
        Runnable runnable = () -> System.out.println("Thread is running");
        new Thread(runnable).start();

        // 5. Using lambda with Function
        List<Integer> squares = Arrays.asList(1, 2, 3, 4).stream().map(x -> x * x).toList();
        System.out.println(squares);
    }
}
