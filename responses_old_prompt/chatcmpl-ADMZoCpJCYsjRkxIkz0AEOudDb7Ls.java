
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Simple Lambda Expression
        names.forEach(name -> System.out.println(name));

        // Example 2: Lambda Expression with Condition
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);

        // Example 3: Lambda Expression with Multiple Parameters
        Consumer<String> greet = name -> System.out.println("Hello, " + name);
        names.forEach(greet);

        // Example 4: Lambda Expression for Math Operation
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        int sum = numbers.stream().mapToInt(num -> num).sum();
        System.out.println("Sum: " + sum);

        // Example 5: Lambda Expression returning a value
        Function<Integer, Integer> square = x -> x * x;
        System.out.println("Square of 5: " + square.apply(5));
    }
}
