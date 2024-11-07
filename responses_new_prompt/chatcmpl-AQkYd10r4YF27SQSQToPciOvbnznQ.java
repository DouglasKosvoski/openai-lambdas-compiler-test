
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Example 1: Simple Lambda expression
        Runnable runnable = () -> System.out.println("Hello, Lambda!");
        runnable.run();
        
        // Example 2: Lambda with parameters
        Consumer<String> greeter = name -> System.out.println("Hello, " + name);
        greeter.accept("World");

        // Example 3: Lambda for filtering a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(n -> System.out.println("Even number: " + n));

        // Example 4: Lambda for transformation
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> uppercasedNames = names.stream()
                                             .map(name -> name.toUpperCase())
                                             .toList();
        uppercasedNames.forEach(System.out::println);

        // Example 5: Lambda for custom functional interface
        MyFunctionalInterface square = x -> x * x;
        System.out.println("Square of 5: " + square.calculate(5));

        // Example 6: Lambda with multiple statements
        Predicate<Integer> isPositive = number -> {
            return number > 0;
        };
        System.out.println("Is 3 positive? " + isPositive.test(3));
    }
    
    @FunctionalInterface
    interface MyFunctionalInterface {
        int calculate(int x);
    }
}
