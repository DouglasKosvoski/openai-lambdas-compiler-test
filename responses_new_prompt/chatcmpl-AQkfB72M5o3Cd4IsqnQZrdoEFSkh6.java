
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Example 1: Simple lambda to print elements of a list
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Consumer<String> printName = name -> System.out.println(name);
        names.forEach(printName);

        // Example 2: Lambda expression for filtering
        Predicate<String> startsWithA = name -> name.startsWith("A");
        List<String> filteredNames = names.stream()
                                           .filter(startsWithA)
                                           .collect(Collectors.toList());
        System.out.println(filteredNames);

        // Example 3: Lambda to perform calculation
        Function<Integer, Integer> square = x -> x * x;
        System.out.println(square.apply(5));

        // Example 4: Sorting a list using lambda
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1);
        List<Integer> sortedNumbers = numbers.stream()
                                              .sorted((a, b) -> b - a)
                                              .collect(Collectors.toList());
        System.out.println(sortedNumbers);

        // Example 5: Nested lambda expressions
        List<Integer> values = Arrays.asList(1, 2, 3, 4);
        int sum = values.stream()
                        .map(x -> x * 2)
                        .reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        // Example 6: Using lambda to define a thread
        Runnable runnableTask = () -> System.out.println("Task is running in a separate thread!");
        new Thread(runnableTask).start();
    }
}
