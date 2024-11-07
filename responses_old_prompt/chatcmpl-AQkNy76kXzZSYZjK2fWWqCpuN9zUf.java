
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Using a Consumer
        Consumer<String> greet = name -> System.out.println("Hello, " + name);
        names.forEach(greet);

        // Example 2: Using a Predicate
        Predicate<String> startsWithA = name -> name.startsWith("A");
        List<String> filteredNames = names.stream().filter(startsWithA).toList();
        System.out.println(filteredNames);

        // Example 3: Using a Function
        Function<String, Integer> stringLength = str -> str.length();
        names.stream().map(stringLength).forEach(length -> System.out.print(length + " "));

        // Example 4: Sorting with a Comparator
        names.sort((name1, name2) -> name1.compareTo(name2));
        System.out.println("\nSorted names: " + names);
    }
}
