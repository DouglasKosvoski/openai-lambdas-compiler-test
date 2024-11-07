
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Sort names in alphabetical order using a lambda expression
        Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println("Sorted names: " + names);

        // Example 2: Filter names that start with "C"
        names.stream()
                .filter(name -> name.startsWith("C"))
                .forEach(name -> System.out.println("Filtered name: " + name));
        
        // Example 3: Calculate the length of each name using method reference
        names.stream()
                .map(String::length)
                .forEach(length -> System.out.println("Name length: " + length));

        // Example 4: Sum of lengths of all names
        int totalLength = names.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println("Total length of all names: " + totalLength);
    }
}
