
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Example 1: Simple lambda expression to print elements
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println(name));

        // Example 2: Lambda expression with a filter
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                                            .filter(num -> num % 2 == 0)
                                            .collect(Collectors.toList());
        System.out.println(evenNumbers);

        // Example 3: Lambda expression to transform elements
        Function<String, String> toUpperCase = str -> str.toUpperCase();
        List<String> upperCaseNames = names.stream()
                                            .map(toUpperCase)
                                            .collect(Collectors.toList());
        System.out.println(upperCaseNames);
        
        // Example 4: Lambda expression as a Comparator
        List<Person> people = Arrays.asList(new Person("John", 25), new Person("Jane", 30), new Person("Jack", 20));
        people.sort((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
        people.forEach(person -> System.out.println(person.getName() + ": " + person.getAge()));

        // Example 5: Lambda expression with a custom functional interface
        MyFunctionalInterface add = (a, b) -> a + b;
        System.out.println("Sum: " + add.calculate(5, 10));
        
        // Example 6: Lambda expression with multiple parameters
        Predicate<String> isLongerThanThree = str -> str.length() > 3;
        System.out.println(names.stream().filter(isLongerThanThree).collect(Collectors.toList()));
    }

    interface MyFunctionalInterface {
        int calculate(int a, int b);
    }

    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
