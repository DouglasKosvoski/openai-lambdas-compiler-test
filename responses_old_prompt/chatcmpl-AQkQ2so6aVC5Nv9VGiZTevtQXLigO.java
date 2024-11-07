
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Example 1: Simple lambda expression
        Runnable runnable = () -> System.out.println("Hello, Lambda!");
        runnable.run();

        // Example 2: Lambda with parameters
        Function<Integer, Integer> square = x -> x * x;
        System.out.println("Square of 5: " + square.apply(5));

        // Example 3: Using lambda with a list
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.sort((s1, s2) -> s1.length() - s2.length());
        System.out.println(names);

        // Example 4: Lambda with multiple statements
        Comparator<String> comparator = (s1, s2) -> {
            System.out.println("Comparing: " + s1 + " and " + s2);
            return s1.compareTo(s2);
        };
        names.sort(comparator);
        System.out.println(names);
    }
}
