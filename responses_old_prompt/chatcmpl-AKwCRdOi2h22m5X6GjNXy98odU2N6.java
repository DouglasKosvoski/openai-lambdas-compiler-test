
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Example 1: Using lambda with Runnable
        Runnable runnable = () -> System.out.println("Hello from Runnable");
        runnable.run();

        // Example 2: Using lambda with a custom functional interface
        MyFunctionalInterface myFunc = (x) -> x * x;
        System.out.println("Square: " + myFunc.calculate(5));

        // Example 3: Using lambda with List for method reference
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println("Name: " + name));

        // Example 4: Using lambda with Predicate
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));
        
        // Example 5: Using lambda to filter a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println("Even number: " + n));
    }
    
    @FunctionalInterface
    interface MyFunctionalInterface {
        int calculate(int x);
    }
}
