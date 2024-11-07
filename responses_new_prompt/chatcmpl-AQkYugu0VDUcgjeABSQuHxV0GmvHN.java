
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Example 1: Simple lambda expression
        Runnable runnable = () -> System.out.println("Hello, Lambda!");
        runnable.run();

        // Example 2: Lambda expression with parameters
        Function<Integer, Integer> square = x -> x * x;
        System.out.println("Square of 5: " + square.apply(5));

        // Example 3: Using Predicate for filtering
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);

        // Example 4: Using lambda expression in a loop
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.forEach(num -> System.out.println("Number: " + num));

        // Example 5: Method reference as a lambda expression
        List<String> filteredNames = names.stream()
            .filter(name -> name.length() > 3)
            .map(String::toUpperCase)
            .toList();
        filteredNames.forEach(System.out::println);

        // Example 6: Combining lambdas with functional interfaces
        List<String> fruits = Arrays.asList("apple", "banana", "kiwi", "mango");
        fruits.sort((a, b) -> a.compareTo(b));
        fruits.forEach(fruit -> System.out.print(fruit + " "));
        
        // Example 7: Lambda expression for a custom function interface
        MyMathOperation addition = (a, b) -> a + b;
        System.out.println("\nAddition of 10 and 20: " + addition.operate(10, 20));
    }

    @FunctionalInterface
    interface MyMathOperation {
        int operate(int a, int b);
    }
}
