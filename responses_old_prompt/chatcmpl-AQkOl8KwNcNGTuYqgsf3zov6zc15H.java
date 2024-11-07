
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Filtering names using a lambda expression
        names.stream()
             .filter(name -> name.startsWith("C"))
             .forEach(name -> System.out.println("Filtered name: " + name));

        // Example 2: Using Consumer to print elements
        Consumer<String> printConsumer = name -> System.out.println("Name: " + name);
        names.forEach(printConsumer);

        // Example 3: Using Predicate to check string length
        Predicate<String> isLongerThanThree = name -> name.length() > 3;
        names.stream()
             .filter(isLongerThanThree)
             .forEach(name -> System.out.println("Long name: " + name));

        // Example 4: Using a lambda to compute the square of a number
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        numbers.stream()
               .map(num -> num * num)
               .forEach(square -> System.out.println("Square: " + square));
    }
}
