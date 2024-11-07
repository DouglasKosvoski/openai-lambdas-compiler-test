
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Example 1: Simple Runnable
        Runnable runnable = () -> System.out.println("Hello from Runnable!");
        runnable.run();

        // Example 2: Using Consumer to print elements
        Consumer<String> stringConsumer = str -> System.out.println("Consumer received: " + str);
        stringConsumer.accept("Hello");

        // Example 3: Filtering a list using Predicate
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream()
            .filter(num -> num % 2 == 0)
            .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        // Example 4: Mapping a list using Function
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> upperCaseNames = names.stream()
            .map(name -> name.toUpperCase())
            .collect(Collectors.toList());
        System.out.println("Uppercase Names: " + upperCaseNames);

        // Example 5: Using a custom functional interface
        MyFunctionalInterface myFunc = (x, y) -> x + y;
        System.out.println("Sum: " + myFunc.operation(5, 10));

        // Example 6: Sorting with a Comparator
        List<String> unsortedNames = Arrays.asList("John", "Alice", "Bob");
        List<String> sortedNames = unsortedNames.stream()
            .sorted((name1, name2) -> name1.compareTo(name2))
            .collect(Collectors.toList());
        System.out.println("Sorted Names: " + sortedNames);
    }

    @FunctionalInterface
    interface MyFunctionalInterface {
        int operation(int a, int b);
    }
}
