
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Example 1: Basic Lambda Expression
        Runnable runnable = () -> System.out.println("Hello, world!");
        runnable.run();

        // Example 2: Using Predicate to filter a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Predicate<Integer> isEven = n -> n % 2 == 0;
        numbers.stream().filter(isEven).forEach(System.out::println);

        // Example 3: Using Function to transform data
        Function<String, Integer> stringLength = str -> str.length();
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.stream().map(stringLength).forEach(System.out::println);

        // Example 4: Using Consumer to print items
        Consumer<String> printConsumer = str -> System.out.println("Name: " + str);
        names.forEach(printConsumer);

        // Example 5: Using lambda with a custom interface
        Operation addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.apply(5, 3));

        // Example 6: Sorting with a lambda expression
        List<String> fruits = Arrays.asList("Banana", "Apple", "Mango");
        fruits.sort((s1, s2) -> s1.compareTo(s2));
        fruits.forEach(System.out::println);

        // Example 7: Using a lambda with a stream to generate a list
        List<Integer> squares = numbers.stream()
                                        .map(n -> n * n)
                                        .collect(Collectors.toList());
        System.out.println(squares);
    }

    interface Operation {
        int apply(int a, int b);
    }
}
