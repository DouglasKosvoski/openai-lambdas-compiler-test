
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        
        // Example 1: Using Consumer
        Consumer<String> printName = name -> System.out.println(name);
        names.forEach(printName);
        
        // Example 2: Using Predicate
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(printName);
        
        // Example 3: Using Function
        Function<String, Integer> nameLength = name -> name.length();
        List<Integer> nameLengths = names.stream().map(nameLength).toList();
        System.out.println(nameLengths);
        
        // Example 4: Using Runnable
        Runnable task = () -> System.out.println("This is a runnable task.");
        new Thread(task).start();
        
        // Example 5: Sorting with custom comparator
        names.stream()
            .sorted((a, b) -> b.compareTo(a))
            .forEach(printName);
    }
}
