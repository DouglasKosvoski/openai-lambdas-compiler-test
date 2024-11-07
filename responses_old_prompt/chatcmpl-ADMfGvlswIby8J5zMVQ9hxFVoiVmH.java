
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Example 1: Filtering a list using a lambda expression
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);

        // Example 2: Applying a function using a lambda expression
        Function<Integer, Integer> square = x -> x * x;
        System.out.println(square.apply(5));

        // Example 3: Using Predicate for condition checking
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(10));

        // Example 4: Sorting a list using lambda expression
        List<String> fruits = Arrays.asList("Banana", "Apple", "Cherry");
        fruits.sort((s1, s2) -> s1.compareTo(s2));
        fruits.forEach(System.out::println);
    }
}
