
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Using lambda to print each name
        Consumer<String> printName = name -> System.out.println(name);
        names.forEach(printName);

        // Example 2: Using lambda to filter names
        Predicate<String> startsWithC = name -> name.startsWith("C");
        names.stream().filter(startsWithC).forEach(printName);

        // Example 3: Using lambda to find the length of each name
        names.stream().map(name -> name.length()).forEach(length -> System.out.println("Length: " + length));

        // Example 4: Using lambda for simple arithmetic
        ArithmeticOperation addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.operate(5, 3));
    }

    interface ArithmeticOperation {
        int operate(int a, int b);
    }
}
