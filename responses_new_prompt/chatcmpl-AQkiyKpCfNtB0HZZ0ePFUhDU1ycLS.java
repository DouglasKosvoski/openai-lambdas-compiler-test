
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Example 1: Using a lambda expression with a List
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println(name));

        // Example 2: Filtering items using a lambda expression
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
               .filter(num -> num % 2 == 0)
               .forEach(num -> System.out.println(num));

        // Example 3: Using a Function interface
        Function<Integer, String> intToString = num -> "Number: " + num;
        System.out.println(intToString.apply(5));

        // Example 4: Using a Predicate interface
        Predicate<String> isLongerThanThree = str -> str.length() > 3;
        System.out.println(isLongerThanThree.test("Java"));
        System.out.println(isLongerThanThree.test("Hi"));

        // Example 5: Using a Consumer to modify an object's field
        class Person {
            String name;

            Person(String name) {
                this.name = name;
            }

            void greet(Consumer<String> greeting) {
                greeting.accept(name);
            }
        }

        Person john = new Person("John");
        john.greet(name -> System.out.println("Hello, " + name + "!"));

        // Example 6: Using a BiFunction to combine two values
        BiFunction<String, String, String> combineNames = (first, last) -> first + " " + last;
        String fullName = combineNames.apply("John", "Doe");
        System.out.println(fullName);
    }
}
