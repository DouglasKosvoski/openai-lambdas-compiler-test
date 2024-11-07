
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Basic lambda expression
        names.forEach(name -> System.out.println(name));

        // Example 2: Filter with predicate
        Predicate<String> startsWithA = s -> s.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);
        
        // Example 3: Sort using lambda
        names.sort((s1, s2) -> s1.compareTo(s2));
        names.forEach(System.out::println);

        // Example 4: Use of Runnable
        Runnable runnable = () -> System.out.println("Runnable executed");
        new Thread(runnable).start();

        // Example 5: Using a custom functional interface
        MyFunctionalInterface square = x -> x * x;
        System.out.println(square.apply(5));
    }

    @FunctionalInterface
    interface MyFunctionalInterface {
        int apply(int x);
    }
}
