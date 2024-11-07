
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        
        // Example 1: Filter names starting with 'A'
        Predicate<String> startsWithA = name -> name.startsWith("A");
        names.stream().filter(startsWithA).forEach(System.out::println);
        
        // Example 2: Print names in uppercase
        Consumer<String> printUpperCase = name -> System.out.println(name.toUpperCase());
        names.forEach(printUpperCase);
        
        // Example 3: Sort names by length
        names.sort(Comparator.comparingInt(String::length));
        System.out.println(names);
        
        // Example 4: Square a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream().map(n -> n * n).forEach(System.out::println);
        
        // Example 5: Check if any name has more than 5 characters
        Predicate<String> hasMoreThan5Chars = name -> name.length() > 5;
        boolean anyLongNames = names.stream().anyMatch(hasMoreThan5Chars);
        System.out.println(anyLongNames);
    }
}
