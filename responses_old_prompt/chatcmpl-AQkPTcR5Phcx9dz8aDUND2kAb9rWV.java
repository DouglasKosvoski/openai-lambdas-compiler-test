
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Example 1: Consumer
        Consumer<String> printName = name -> System.out.println(name);
        names.forEach(printName);
        
        // Example 2: Function
        Function<String, Integer> getNameLength = name -> name.length();
        names.forEach(name -> System.out.println("Length of " + name + ": " + getNameLength.apply(name)));

        // Example 3: Predicate
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(name -> System.out.println(name + " starts with A"));

        // Example 4: Runnable
        Runnable task = () -> System.out.println("Task is running!");
        new Thread(task).start();
        
        // Example 5: Comparator
        names.sort((a, b) -> a.compareTo(b));
        System.out.println("Sorted names: " + names);
    }
}
