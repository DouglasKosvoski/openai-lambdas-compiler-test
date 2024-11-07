
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diane");

        // Example 1: Using lambda with Consumer
        Consumer<String> printName = name -> System.out.println(name);
        names.forEach(printName);

        // Example 2: Using lambda with Predicate
        Predicate<String> startsWithA = name -> name.startsWith("A");
        long count = names.stream().filter(startsWithA).count();
        System.out.println("Names starting with A: " + count);

        // Example 3: Using lambda with Function
        Function<String, String> toUpperCase = name -> name.toUpperCase();
        List<String> upperNames = names.stream().map(toUpperCase).toList();
        System.out.println("Uppercase names: " + upperNames);

        // Example 4: Using lambda for sorting
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 5, 6);
        numbers.sort((a, b) -> Integer.compare(a, b));
        System.out.println("Sorted numbers: " + numbers);

        // Example 5: Using lambda for creating a runnable
        Runnable task = () -> System.out.println("Runnable task executed!");
        new Thread(task).start();

        // Example 6: Using lambda with a custom functional interface
        MyFunctionalInterface customFunction = (x, y) -> x + y;
        int result = customFunction.apply(5, 10);
        System.out.println("Result of custom function: " + result);
    }

    @FunctionalInterface
    interface MyFunctionalInterface {
        int apply(int x, int y);
    }
}
