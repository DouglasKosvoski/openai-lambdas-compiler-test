
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Example 1: Simple lambda for a Runnable
        Runnable runnable = () -> System.out.println("Hello, World!");
        runnable.run();

        // Example 2: Using lambda with a List and forEach
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println(name));

        // Example 3: Lambda for Predicate (filtering even numbers)
        Predicate<Integer> isEven = number -> number % 2 == 0;
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.stream().filter(isEven).forEach(System.out::println);

        // Example 4: Lambda with Function to convert String to Integer
        Function<String, Integer> stringToInteger = str -> Integer.valueOf(str);
        List<String> stringNumbers = Arrays.asList("1", "2", "3");
        stringNumbers.stream().map(stringToInteger).forEach(System.out::println);

        // Example 5: Using lambda in a custom functional interface
        MyFunctionalInterface myFunction = (a, b) -> a + b;
        System.out.println(myFunction.operation(5, 3));

        // Example 6: Sorting a list of strings with a custom comparator
        List<String> unsorted = Arrays.asList("banana", "apple", "cherry");
        unsorted.sort((s1, s2) -> s1.compareTo(s2));
        unsorted.forEach(System.out::println);
    }

    @FunctionalInterface
    interface MyFunctionalInterface {
        int operation(int a, int b);
    }
}
