
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        
        // Example 1: Simple lambda expression to print each element in a list
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println(name));
        
        // Example 2: Lambda expression as a Predicate to filter even numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.stream()
               .filter(num -> num % 2 == 0)
               .forEach(System.out::println);
        
        // Example 3: Lambda expression to square a number
        Function<Integer, Integer> square = x -> x * x;
        System.out.println(square.apply(5));
        
        // Example 4: Lambda expression to concatenate strings
        BiFunction<String, String, String> concatenate = (s1, s2) -> s1 + s2;
        System.out.println(concatenate.apply("Hello, ", "World!"));
        
        // Example 5: Lambda expression with multiple statements
        Consumer<Integer> printSquareAndCube = num -> {
            System.out.println("Square: " + (num * num));
            System.out.println("Cube: " + (num * num * num));
        };
        printSquareAndCube.accept(3);
        
        // Example 6: Using lambda in a sorting context
        List<String> fruits = Arrays.asList("Banana", "Apple", "Mango", "Cherry");
        fruits.sort((f1, f2) -> f1.compareTo(f2));
        fruits.forEach(System.out::println);
        
        // Example 7: Using lambda with a method reference
        List<String> cars = Arrays.asList("Ford", "Toyota", "Honda");
        cars.forEach(System.out::println);
        
        // Example 8: Implementing a simple runnable using a lambda
        Runnable runnable = () -> System.out.println("Runnable running!");
        new Thread(runnable).start();
        
        // Example 9: Lambda with var to find the length of a string
        Function<String, Integer> stringLength = str -> str.length();
        System.out.println(stringLength.apply("Lambda"));
        
        // Example 10: Chaining multiple lambda expressions
        List<Integer> values = Arrays.asList(2, 4, 6, 8);
        int total = values.stream()
                          .map(x -> x * x)
                          .reduce(0, Integer::sum);
        System.out.println(total);
    }
}
