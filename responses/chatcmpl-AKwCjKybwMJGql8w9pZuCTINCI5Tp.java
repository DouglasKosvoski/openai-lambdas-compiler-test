
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Diana");

        // Example 1: Filtering with a lambda expression
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Filtered Names: " + filteredNames);

        // Example 2: Mapping with a lambda expression
        List<Integer> nameLengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("Name Lengths: " + nameLengths);

        // Example 3: Using a Function functional interface
        Function<String, String> toUpperCase = str -> str.toUpperCase();
        String upperName = toUpperCase.apply("example");
        System.out.println("Uppercase: " + upperName);

        // Example 4: Predicate to check name length
        Predicate<String> isLongName = name -> name.length() > 4;
        long count = names.stream().filter(isLongName).count();
        System.out.println("Count of long names: " + count);
    }
}
