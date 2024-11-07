
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        // Example 1: Basic lambda expression
        Runnable runnable = () -> System.out.println("Hello from a lambda!");
        runnable.run();

        // Example 2: Lambda expression for a functional interface
        Function<Integer, Integer> square = x -> x * x;
        System.out.println("Square of 5: " + square.apply(5));

        // Example 3: Filter a list using lambda expression
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        names.stream()
                .filter(name -> name.startsWith("C"))
                .forEach(System.out::println);

        // Example 4: Lambda expression for a custom comparator
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Date");
        fruits.sort((f1, f2) -> f1.length() - f2.length());
        System.out.println(fruits);

        // Example 5: Using lambda in a method
        System.out.println("Length of 'example': " + getLength("example", s -> s.length()));

        // Example 6: Lambda expression with two parameters
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("Addition of 10 and 20: " + add.apply(10, 20));

        // Example 7: Using lambda to create a Thread
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread is running " + i);
            }
        }).start();

        // Example 8: Predicate to check if a number is even
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));
    }

    public static <T> int getLength(T t, Function<T, Integer> function) {
        return function.apply(t);
    }
}
