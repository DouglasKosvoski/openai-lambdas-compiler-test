
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Example 1: Using a lambda expression with Runnable
        Runnable runnable = () -> System.out.println("Running in a thread!");
        new Thread(runnable).start();

        // Example 2: Consumer that prints a string
        Consumer<String> printConsumer = str -> System.out.println("Consumed: " + str);
        printConsumer.accept("Hello, Lambda!");

        // Example 3: Function to convert a string to its length
        Function<String, Integer> lengthFunction = str -> str.length();
        System.out.println("Length of 'Lambda': " + lengthFunction.apply("Lambda"));

        // Example 4: Predicate to check if a number is even
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));

        // Example 5: Filtering a list using a lambda expression
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream()
                .filter(isEven)
                .collect(Collectors.toList());
        System.out.println("Even numbers: " + evenNumbers);

        // Example 6: Use case with sort and lambda expression
        List<String> names = Arrays.asList("John", "Alice", "Bob", "Diana");
        names.sort((a, b) -> b.compareTo(a));
        System.out.println("Sorted names in descending order: " + names);

        // Example 7: Using a custom functional interface with lambda
        MyFunctionalInterface myFunc = (x, y) -> x * y;
        System.out.println("Product of 4 and 5: " + myFunc.calculate(4, 5));

        // Example 8: Combining two lambdas
        Function<Integer, Integer> multiplyBy2 = x -> x * 2;
        Function<Integer, Integer> add3 = x -> x + 3;
        Function<Integer, Integer> combinedFunction = multiplyBy2.andThen(add3);
        System.out.println("Combined function result: " + combinedFunction.apply(5));
    }

    @FunctionalInterface
    interface MyFunctionalInterface {
        int calculate(int a, int b);
    }
}
