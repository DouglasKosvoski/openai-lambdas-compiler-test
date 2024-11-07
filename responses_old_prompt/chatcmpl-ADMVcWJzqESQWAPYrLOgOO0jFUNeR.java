
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        
        // Print names using lambda expression
        names.forEach(name -> System.out.println(name));
        
        // Filter names starting with 'A'
        names.stream()
             .filter(name -> name.startsWith("A"))
             .forEach(name -> System.out.println("Starts with A: " + name));
        
        // Sort names in reverse order
        Collections.sort(names, (a, b) -> b.compareTo(a));
        System.out.println("Sorted names: " + names);
        
        // Compute square of numbers using lambda
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
               .map(num -> num * num)
               .forEach(square -> System.out.println("Square: " + square));
        
        // Create a custom functional interface
        MyFunctionalInterface greeting = () -> System.out.println("Hello, World!");
        greeting.sayHello();
    }

    @FunctionalInterface
    interface MyFunctionalInterface {
        void sayHello();
    }
}
