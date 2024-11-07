
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Example 1: Using a lambda expression with a functional interface
        Runnable run = () -> System.out.println("Running a task");
        run.run();

        // Example 2: Using a lambda expression with a Consumer
        Consumer<String> printConsumer = s -> System.out.println(s);
        printConsumer.accept("Hello, World!");

        // Example 3: Using a lambda expression with a Predicate
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(4)); // true
        System.out.println(isEven.test(5)); // false

        // Example 4: Using a lambda expression with a Function
        Function<String, Integer> stringLength = str -> str.length();
        System.out.println(stringLength.apply("Lambda")); // 6

        // Example 5: Filtering a list with a lambda expression
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String> filteredNames = names.stream()
            .filter(name -> name.startsWith("A"))
            .collect(Collectors.toList());
        System.out.println(filteredNames); // [Alice]

        // Example 6: Using a lambda expression to sort a list based on string length
        List<String> words = Arrays.asList("banana", "fig", "apple", "cherry");
        words.sort((a, b) -> Integer.compare(a.length(), b.length()));
        System.out.println(words); // [fig, apple, banana, cherry]

        // Example 7: Using a lambda expression for map operation
        List<Integer> lengths = names.stream()
            .map(String::length)
            .collect(Collectors.toList());
        System.out.println(lengths); // [5, 3, 7, 5]

        // Example 8: Using a lambda expression as an event handler (simulated)
        final String[] event = { "Button Clicked" };
        EventHandler clickHandler = (e) -> System.out.println("Event: " + e[0]);
        clickHandler.handle(event);

        // Example 9: Implementing a custom functional interface with a lambda
        MyFunctionalInterface doubler = x -> x * 2;
        System.out.println(doubler.apply(5)); // 10

        // Example 10: Using a lambda expression in a method reference context
        List<String> upperCaseNames = names.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());
        System.out.println(upperCaseNames); // [ALICE, BOB, CHARLIE, DAVID]
    }

    interface EventHandler {
        void handle(String[] event);
    }

    @FunctionalInterface
    interface MyFunctionalInterface {
        int apply(int x);
    }
}
