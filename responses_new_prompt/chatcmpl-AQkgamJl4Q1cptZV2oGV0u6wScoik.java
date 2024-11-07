
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Example 1: Using lambda expression with Runnable
        Runnable task = () -> System.out.println("Task is running");
        new Thread(task).start();

        // Example 2: Using lambda with a Predicate to filter even numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Predicate<Integer> isEven = n -> n % 2 == 0;
        List<Integer> evenNumbers = numbers.stream()
                                            .filter(isEven)
                                            .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        // Example 3: Using lambda with Consumer to print elements
        Consumer<String> print = s -> System.out.println(s);
        List<String> strings = Arrays.asList("Hello", "Lambda", "Expressions");
        strings.forEach(print);

        // Example 4: Using lambda with Function to convert strings to their lengths
        Function<String, Integer> stringLength = s -> s.length();
        List<Integer> lengths = strings.stream()
                                        .map(stringLength)
                                        .collect(Collectors.toList());
        System.out.println("String lengths: " + lengths);

        // Example 5: Using lambda to sort a list of strings
        List<String> sortedStrings = strings.stream()
                                             .sorted((s1, s2) -> s1.length() - s2.length())
                                             .collect(Collectors.toList());
        System.out.println("Sorted strings by length: " + sortedStrings);

        // Example 6: Using a method reference with lambda expression
        List<String> uppercasedStrings = strings.stream()
                                                  .map(String::toUpperCase)
                                                  .collect(Collectors.toList());
        System.out.println("Uppercased strings: " + uppercasedStrings);
        
        // Example 7: Lambda expression that takes multiple parameters
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("Sum of 10 and 5: " + add.apply(10, 5));
    }
}
