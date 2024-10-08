
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        
        // 1. Using lambda expression with Predicate
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);
        
        // 2. Using lambda expression with Consumer
        Consumer<String> printUpperCase = name -> System.out.println(name.toUpperCase());
        names.forEach(printUpperCase);
        
        // 3. Using lambda expression to sort
        List<Integer> numbers = Arrays.asList(4, 2, 3, 1);
        numbers.sort((a, b) -> b - a);
        numbers.forEach(System.out::println);
        
        // 4. Using lambda expression to calculate square
        List<Integer> squares = Arrays.asList(1, 2, 3, 4).stream()
                .map(n -> n * n)
                .toList();
        squares.forEach(System.out::println);
        
        // 5. Using lambda expression with Runnable
        Runnable runnable = () -> System.out.println("Hello from a lambda Runnable!");
        new Thread(runnable).start();
    }
}
