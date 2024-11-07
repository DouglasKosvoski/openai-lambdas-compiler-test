
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Example 1: Using a lambda expression with Predicate
        Predicate<String> startsWithA = name -> name.startsWith("A");
        for (String name : names) {
            if (startsWithA.test(name)) {
                System.out.println(name);
            }
        }

        // Example 2: Using a lambda expression with Function
        Function<String, Integer> stringLength = str -> str.length();
        for (String name : names) {
            System.out.println(name + " has length: " + stringLength.apply(name));
        }

        // Example 3: Using a lambda expression with Consumer
        Consumer<String> printName = name -> System.out.println("Name: " + name);
        names.forEach(printName);
        
        // Example 4: Sort using lambda expression
        names.sort((a, b) -> b.compareTo(a));
        System.out.println("Sorted names: " + names);
    }
}
