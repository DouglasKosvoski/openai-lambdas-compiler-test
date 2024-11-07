
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Example 1: Basic lambda expression
        Runnable runnable = () -> System.out.println("Hello, World!");
        runnable.run();

        // Example 2: Lambda expression with single parameter
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println(name));

        // Example 3: Lambda expression with multiple parameters
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(5, 3));

        // Example 4: Lambda expression as a predicate
        Predicate<String> isLongerThanThree = str -> str.length() > 3;
        System.out.println(isLongerThanThree.test("Java"));

        // Example 5: Sorting with lambda
        List<String> fruits = Arrays.asList("Banana", "Apple", "Cherry");
        fruits.sort((s1, s2) -> s1.compareTo(s2));
        fruits.forEach(System.out::println);
    }
}
