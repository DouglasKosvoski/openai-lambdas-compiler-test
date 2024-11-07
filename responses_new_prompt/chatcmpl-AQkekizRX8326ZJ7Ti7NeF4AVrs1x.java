
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // Example 1: Simple lambda expression to print a message
        Consumer<String> printMessage = message -> System.out.println(message);
        printMessage.accept("Hello, World!");

        // Example 2: Lambda expression to square a number
        Function<Integer, Integer> square = num -> num * num;
        System.out.println("Square of 5: " + square.apply(5));

        // Example 3: Filtering a list using lambda expression
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        names.stream()
            .filter(name -> name.startsWith("C"))
            .forEach(System.out::println);

        // Example 4: Lambda expression as a Predicate
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 10 even? " + isEven.test(10));

        // Example 5: Supplier with a lambda expression
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Random value: " + randomValue.get());

        // Example 6: Sorting a list with lambda expression
        List<String> fruits = Arrays.asList("Banana", "Apple", "Cherry", "Mango");
        fruits.sort((a, b) -> a.compareTo(b));
        System.out.println(fruits);

        // Example 7: Using a method reference with lambda expression
        List<String> cities = Arrays.asList("Paris", "London", "New York", "Tokyo");
        cities.forEach(System.out::println);
        
        // Example 8: Custom functional interface
        MyFunctionalInterface add = (x, y) -> x + y;
        System.out.println("Addition: " + add.apply(5, 3));
    }

    @FunctionalInterface
    interface MyFunctionalInterface {
        int apply(int x, int y);
    }
}
