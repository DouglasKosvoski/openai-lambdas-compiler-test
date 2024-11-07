
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Example 1: Simple lambda expression for runnable
        Runnable runnable = () -> System.out.println("Hello from Runnable!");
        runnable.run();

        // Example 2: Lambda expression with parameters for a Consumer
        Consumer<String> stringConsumer = s -> System.out.println("Consuming: " + s);
        stringConsumer.accept("Lambda Expressions in Java");

        // Example 3: Lambda expression for a Function
        Function<Integer, Integer> square = x -> x * x;
        System.out.println("Square of 5 is: " + square.apply(5));

        // Example 4: Lambda expression as a Predicate
        Predicate<String> isEmpty = String::isEmpty;
        System.out.println("Is empty string empty? " + isEmpty.test(""));

        // Example 5: Using lambda with Collections
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("C"))
                .collect(Collectors.toList());
        System.out.println("Filtered names: " + filteredNames);

        // Example 6: Lambda expression for sorting
        List<String> unsortedNames = Arrays.asList("Charlie", "Alice", "Bob", "David");
        unsortedNames.sort((a, b) -> b.compareTo(a));
        System.out.println("Sorted names in reverse: " + unsortedNames);

        // Example 7: Lambda expression with multiple parameters
        Function<Integer, String> intToString = (Integer num) -> "Number: " + num;
        System.out.println(intToString.apply(10));

        // Example 8: Using lambda with custom functional interface
        MyFunctionalInterface myFunc = (a, b) -> a + b;
        System.out.println("Sum is: " + myFunc.add(5, 10));
    }

    @FunctionalInterface
    interface MyFunctionalInterface {
        int add(int a, int b);
    }
}
