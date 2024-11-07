
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");

        // Example 1: Using Consumer to print each name
        Consumer<String> printName = name -> System.out.println(name);
        names.forEach(printName);

        // Example 2: Using Predicate to filter names starting with 'C'
        Predicate<String> startsWithC = name -> name.startsWith("C");
        names.stream().filter(startsWithC).forEach(System.out::println);

        // Example 3: Using Function to get the length of each name
        Function<String, Integer> nameLength = name -> name.length();
        names.stream().map(nameLength).forEach(length -> System.out.print(length + " "));

        // Example 4: Using Comparator to sort names
        List<String> sorted = names.stream().sorted((a, b) -> a.compareTo(b)).toList();
        System.out.println("\nSorted Names: " + sorted);
        
        // Example 5: Using lambda to calculate square of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream().map(num -> num * num).forEach(square -> System.out.print(square + " "));
    }
}
