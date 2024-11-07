
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Example 1: Filtering with a Predicate
        names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);

        // Example 2: Mapping with a Function
        List<Integer> nameLengths = names.stream().map(String::length).toList();
        System.out.println(nameLengths);

        // Example 3: Consuming with a Consumer
        Consumer<String> printName = name -> System.out.println("Name: " + name);
        names.forEach(printName);

        // Example 4: Sorting with a Comparator
        names.stream().sorted((s1, s2) -> s1.compareToIgnoreCase(s2)).forEach(System.out::println);

        // Example 5: Summing with a custom Function
        int totalLength = names.stream().mapToInt(String::length).sum();
        System.out.println("Total Length: " + totalLength);
    }
}
