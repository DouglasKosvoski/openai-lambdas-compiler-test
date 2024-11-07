
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Example 1: Sorting a list of strings
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");
        Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println("Sorted Names: " + names);

        // Example 2: Using Predicate to filter a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        // Example 3: Using Consumer to print elements of a list
        Consumer<String> printConsumer = s -> System.out.println(s);
        names.forEach(printConsumer);

        // Example 4: Using Function to transform a list of strings to their lengths
        Function<String, Integer> stringLength = String::length;
        List<Integer> lengths = names.stream()
                .map(stringLength)
                .collect(Collectors.toList());
        System.out.println("Lengths: " + lengths);

        // Example 5: Using a custom functional interface with a lambda expression
        MyFunctionalInterface myFunc = s -> "Hello, " + s;
        System.out.println(myFunc.sayHello("World"));

        // Example 6: Using a method reference to find the maximum in a list
        int max = numbers.stream().max(Integer::compare).orElseThrow();
        System.out.println("Maximum Number: " + max);
    }

    @FunctionalInterface
    interface MyFunctionalInterface {
        String sayHello(String name);
    }
}
