
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        
        // Example 1: Using a lambda expression with a Consumer
        Consumer<String> greet = name -> System.out.println("Hello, " + name);
        names.forEach(greet);
        
        // Example 2: Using a lambda expression with a Comparator
        Collections.sort(names, (a, b) -> b.compareTo(a));
        System.out.println(names);
        
        // Example 3: Using a lambda expression with a Predicate
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);
        
        // Example 4: Using a lambda expression with a Function
        Function<String, Integer> stringLength = str -> str.length();
        names.stream().map(stringLength).forEach(System.out::println);
        
        // Example 5: Using a lambda expression to create a Runnable
        Runnable task = () -> System.out.println("Task executed!");
        new Thread(task).start();
    }
}
