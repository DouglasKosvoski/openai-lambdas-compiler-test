
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Example 1: Basic Lambda Expression
        Runnable hello = () -> System.out.println("Hello, World!");
        hello.run();

        // Example 2: Lambda Expression with Parameters
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println(name));

        // Example 3: Filtering with Lambda Expression
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = numbers.stream()
                                            .filter(n -> n % 2 == 0)
                                            .collect(Collectors.toList());
        System.out.println(evenNumbers);

        // Example 4: Lambda Expression with Return Value
        Function<Integer, Integer> square = x -> x * x;
        System.out.println(square.apply(5));

        // Example 5: Sorting with Lambda Expression
        List<String> fruits = Arrays.asList("Banana", "Apple", "Mango");
        List<String> sortedFruits = fruits.stream()
                                           .sorted((a, b) -> a.compareTo(b))
                                           .collect(Collectors.toList());
        System.out.println(sortedFruits);
    }
    
    @FunctionalInterface
    interface Function<T, R> {
        R apply(T t);
    }
}
