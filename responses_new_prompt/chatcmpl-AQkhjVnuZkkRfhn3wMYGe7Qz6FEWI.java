
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Example 1: Using lambda expression with Runnable
        Runnable task = () -> System.out.println("Task is running...");
        new Thread(task).start();

        // Example 2: Using lambda with Comparator
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        names.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println(names);

        // Example 3: Using lambda with Consumer
        Consumer<String> printConsumer = s -> System.out.println(s);
        printConsumer.accept("Hello, World!");

        // Example 4: Using lambda with Function
        Function<Integer, String> intToString = num -> "Number: " + num;
        System.out.println(intToString.apply(5));

        // Example 5: Using lambda with Predicate
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = numbers.stream()
                                             .filter(n -> n % 2 == 0)
                                             .collect(Collectors.toList());
        System.out.println(evenNumbers);

        // Example 6: Using lambda in a method reference
        List<String> upperNames = names.stream()
                                        .map(String::toUpperCase)
                                        .collect(Collectors.toList());
        System.out.println(upperNames);

        // Example 7: Using lambda for a custom functional interface
        MyFunctionalInterface square = (x) -> x * x;
        System.out.println("Square of 4: " + square.calculate(4));
    }

    @FunctionalInterface
    interface MyFunctionalInterface {
        int calculate(int x);
    }
}
