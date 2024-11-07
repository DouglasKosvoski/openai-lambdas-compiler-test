
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Example 1: Simple lambda expression to print a message
        Runnable runnable = () -> System.out.println("Hello, Lambda!");
        runnable.run();

        // Example 2: Lambda expression to square each element in a list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream().map(x -> x * x).forEach(System.out::println);

        // Example 3: Use of Predicate to filter even numbers
        Predicate<Integer> isEven = x -> x % 2 == 0;
        numbers.stream().filter(isEven).forEach(System.out::println);

        // Example 4: Lambda expression with multiple parameters in a functional interface
        Function<Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(5, 10));

        // Example 5: Using a Consumer to print elements of a list
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println("Name: " + name));

        // Example 6: Sorting a list of strings by length using a lambda expression
        List<String> words = Arrays.asList("banana", "apple", "kiwi");
        words.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        words.forEach(System.out::println);

        // Example 7: Combining two functions
        Function<String, String> toUpperCase = s -> s.toUpperCase();
        Function<String, String> addExclamation = s -> s + "!";
        Function<String, String> combinedFunction = toUpperCase.andThen(addExclamation);
        System.out.println(combinedFunction.apply("hello"));

        // Example 8: Creating a custom functional interface
        MyFunctionalInterface myFunc = (a, b) -> a * b;
        System.out.println(myFunc.calculate(5, 3));
    }

    @FunctionalInterface
    interface MyFunctionalInterface {
        int calculate(int a, int b);
    }
}
