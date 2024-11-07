
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Example 1: Using Consumer to print elements of a list
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Consumer<String> printName = name -> System.out.println(name);
        names.forEach(printName);

        // Example 2: Using Predicate to filter a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Predicate<Integer> isEven = number -> number % 2 == 0;
        List<Integer> evenNumbers = numbers.stream()
                                             .filter(isEven)
                                             .collect(Collectors.toList());
        System.out.println(evenNumbers);

        // Example 3: Using Function to convert a list of strings to their lengths
        List<String> stringList = Arrays.asList("Java", "Python", "C++");
        Function<String, Integer> stringLength = str -> str.length();
        List<Integer> lengths = stringList.stream()
                                             .map(stringLength)
                                             .collect(Collectors.toList());
        System.out.println(lengths);

        // Example 4: Using a lambda to sort a list of strings by length
        List<String> unsorted = Arrays.asList("banana", "apple", "kiwi", "blueberry");
        unsorted.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(unsorted);

        // Example 5: Using a lambda to create a runnable
        Runnable runnable = () -> System.out.println("Running in a thread");
        new Thread(runnable).start();

        // Example 6: Chaining multiple operations in a stream
        List<String> fruits = Arrays.asList("apple", "banana", "pear", "orange");
        List<String> filteredFruits = fruits.stream()
                                             .filter(fruit -> fruit.startsWith("a"))
                                             .map(String::toUpperCase)
                                             .collect(Collectors.toList());
        System.out.println(filteredFruits);
    }
}
