
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Example 1: Simple lambda for adding two numbers
        Function<Integer, Integer> addFive = x -> x + 5;
        System.out.println("Add 5 to 10: " + addFive.apply(10));

        // Example 2: Lambda expression with a Predicate
        Predicate<String> isLongerThanThree = str -> str.length() > 3;
        System.out.println("Is 'Hello' longer than 3 characters? " + isLongerThanThree.test("Hello"));

        // Example 3: Using lambda with Arrays.sort and Comparator
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Diana");
        Collections.sort(names, (a, b) -> b.compareTo(a));
        System.out.println("Sorted names in descending order: " + names);

        // Example 4: Using a lambda expression in a stream
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().map(x -> x * x).reduce(0, Integer::sum);
        System.out.println("Sum of squares: " + sum);

        // Example 5: Multi-line lambda expression
        Function<Integer, String> numberToString = number -> {
            if (number == 1) return "One";
            else if (number == 2) return "Two";
            else return "Unknown";
        };
        System.out.println("Number 1 in words: " + numberToString.apply(1));
        
        // Example 6: Lambda with a Runnable
        Runnable runnable = () -> System.out.println("Running in a separate thread");
        new Thread(runnable).start();
    }
}
