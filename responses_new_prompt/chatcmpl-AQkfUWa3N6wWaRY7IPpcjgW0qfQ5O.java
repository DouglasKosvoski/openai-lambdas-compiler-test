
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        // Example 1: Simple lambda that prints a message
        Consumer<String> printMessage = message -> System.out.println(message);
        printMessage.accept("Hello, World!");

        // Example 2: Lambda expression to calculate the square of a number
        Function<Integer, Integer> square = x -> x * x;
        System.out.println("Square of 5: " + square.apply(5));

        // Example 3: Predicate to check if a number is even
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));

        // Example 4: Using lambda with List and forEach
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println("Name: " + name));

        // Example 5: Lambda expression to create a random number
        Supplier<Double> randomNumber = () -> Math.random();
        System.out.println("Random Number: " + randomNumber.get());

        // Example 6: Sorting a list of strings by their length
        List<String> words = Arrays.asList("banana", "apple", "kiwi", "pineapple");
        words.sort((word1, word2) -> Integer.compare(word1.length(), word2.length()));
        System.out.println("Sorted by length: " + words);

        // Example 7: Using a lambda for a custom functional interface
        MyFunctionalInterface myFunc = (a, b) -> a + b;
        System.out.println("Sum of 5 and 10: " + myFunc.operate(5, 10));
    }

    @FunctionalInterface
    interface MyFunctionalInterface {
        int operate(int a, int b);
    }
}
