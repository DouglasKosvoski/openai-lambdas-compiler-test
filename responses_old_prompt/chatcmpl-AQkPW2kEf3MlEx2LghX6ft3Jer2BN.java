
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Example 1: Using Consumer to print names
        Consumer<String> printName = name -> System.out.println(name);
        names.forEach(printName);

        // Example 2: Using Predicate to filter names
        Predicate<String> startsWithA = name -> name.startsWith("A");
        List<String> filteredNames = names.stream()
                                           .filter(startsWithA)
                                           .toList();
        System.out.println(filteredNames);

        // Example 3: Using Function to get the length of names
        Function<String, Integer> nameLength = name -> name.length();
        List<Integer> nameLengths = names.stream()
                                          .map(nameLength)
                                          .toList();
        System.out.println(nameLengths);

        // Example 4: Using a simple lambda for sum
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }
}
