
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // Example 1: Using a lambda expression to create a simple runnable
        Runnable runnable = () -> System.out.println("Hello from a lambda runnable");
        runnable.run();

        // Example 2: Using a lambda expression with a Consumer
        Consumer<String> printConsumer = s -> System.out.println(s);
        printConsumer.accept("Hello from Consumer!");

        // Example 3: Using a lambda expression with a Function
        Function<Integer, Integer> squareFunction = x -> x * x;
        System.out.println("Square of 5: " + squareFunction.apply(5));

        // Example 4: Using a lambda expression with a Predicate
        Predicate<String> isLongerThan3 = s -> s.length() > 3;
        System.out.println("Is 'Java' longer than 3? " + isLongerThan3.test("Java"));
        System.out.println("Is 'Hi' longer than 3? " + isLongerThan3.test("Hi"));

        // Example 5: Using lambda expressions to filter a list
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        names.stream()
            .filter(name -> name.startsWith("A"))
            .forEach(name -> System.out.println("Name starting with A: " + name));

        // Example 6: Using a Supplier
        Supplier<String> stringSupplier = () -> "Supplied String";
        System.out.println(stringSupplier.get());

        // Example 7: Using lambda expressions for sorting
        List<String> fruits = Arrays.asList("Banana", "Apple", "Orange", "Mango");
        fruits.sort((f1, f2) -> f1.compareTo(f2));
        System.out.println("Sorted fruits: " + fruits);

        // Example 8: Using a lambda expression for a custom event listener
        EventListener eventListener = event -> System.out.println("Event triggered: " + event);
        eventListener.onEvent("Sample event");
    }

    interface EventListener {
        void onEvent(String event);
    }
}
