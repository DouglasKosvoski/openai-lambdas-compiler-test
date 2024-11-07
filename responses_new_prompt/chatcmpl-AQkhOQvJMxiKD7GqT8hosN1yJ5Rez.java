
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Example 1: Using a lambda expression to implement a Runnable
        Runnable task = () -> System.out.println("Hello from a Runnable!");
        new Thread(task).start();

        // Example 2: Using a lambda expression with a custom functional interface
        MyFunctionalInterface myFunc = (x, y) -> x + y;
        System.out.println("Sum: " + myFunc.apply(5, 10));

        // Example 3: Using Predicate to filter a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream()
                                             .filter(n -> n % 2 == 0)
                                             .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        // Example 4: Using Function to transform a list of strings to their lengths
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<Integer> nameLengths = names.stream()
                                          .map(name -> name.length())
                                          .collect(Collectors.toList());
        System.out.println("Name Lengths: " + nameLengths);

        // Example 5: Using Consumer to print elements of a list
        Consumer<String> print = s -> System.out.println(s);
        names.forEach(print);

        // Example 6: Combining multiple lambda expressions
        List<String> modifiedNames = names.stream()
                                           .filter(name -> name.startsWith("A"))
                                           .map(name -> name.toUpperCase())
                                           .collect(Collectors.toList());
        System.out.println("Modified Names: " + modifiedNames);
    }

    @FunctionalInterface
    interface MyFunctionalInterface {
        int apply(int x, int y);
    }
}
