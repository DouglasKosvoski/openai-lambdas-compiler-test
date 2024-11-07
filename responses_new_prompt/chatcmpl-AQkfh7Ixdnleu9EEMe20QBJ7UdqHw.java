
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // Example 1: Basic usage of a lambda expression
        Runnable runnable = () -> System.out.println("Hello, World!");
        runnable.run();

        // Example 2: Using a lambda as a Consumer
        Consumer<String> printer = s -> System.out.println(s);
        printer.accept("Lambda Expressions in Java");

        // Example 3: Using a lambda with a Predicate
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));

        // Example 4: Using a lambda with Function
        Function<Integer, String> intToString = num -> "Number: " + num;
        System.out.println(intToString.apply(10));

        // Example 5: Filtering a list using a lambda
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana");
        names.stream().filter(name -> name.startsWith("C")).forEach(System.out::println);

        // Example 6: Sorting a list with a custom comparator
        List<String> fruits = Arrays.asList("Banana", "Apple", "Orange", "Grapes");
        fruits.sort((a, b) -> b.compareTo(a));
        fruits.forEach(fruit -> System.out.println(fruit));

        // Example 7: Using a Supplier
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Random Value: " + randomValue.get());

        // Example 8: Using a lambda with a method reference for sorting
        List<String> animals = Arrays.asList("Zebra", "Elephant", "Monkey", "Cat");
        animals.sort(String::compareTo);
        animals.forEach(System.out::println);
    }
}
