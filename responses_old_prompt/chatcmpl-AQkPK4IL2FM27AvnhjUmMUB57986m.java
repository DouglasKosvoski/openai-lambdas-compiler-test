
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Example 1: Using lambda for foreach
        names.forEach(name -> System.out.println(name));
        
        // Example 2: Using lambda for filtering
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(name -> System.out.println("Starts with A: " + name));

        // Example 3: Using lambda with Consumer
        Consumer<String> printUpperCase = name -> System.out.println(name.toUpperCase());
        names.forEach(printUpperCase);
        
        // Example 4: Using lambda for sorting
        names.sort((name1, name2) -> name1.compareTo(name2));
        names.forEach(name -> System.out.println("Sorted: " + name));
    }
}
