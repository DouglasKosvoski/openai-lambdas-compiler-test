
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        
        // Example 1: Using a lambda expression to filter even numbers
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        
        // Example 2: Using a lambda expression to calculate the square of each number
        numbers.stream().map(n -> n * n).forEach(System.out::println);
        
        // Example 3: Using a lambda expression to count numbers greater than 3
        long count = numbers.stream().filter(n -> n > 3).count();
        System.out.println(count);
        
        // Example 4: Using a lambda expression with a custom functional interface
        operate((x, y) -> x + y, 5, 3);
        
        // Example 5: Using a lambda expression to check if a string is empty
        Predicate<String> isEmpty = s -> s.isEmpty();
        System.out.println(isEmpty.test(""));
    }

    public static void operate(BiOperation op, int a, int b) {
        System.out.println(op.apply(a, b));
    }

    @FunctionalInterface
    interface BiOperation {
        int apply(int a, int b);
    }
}
