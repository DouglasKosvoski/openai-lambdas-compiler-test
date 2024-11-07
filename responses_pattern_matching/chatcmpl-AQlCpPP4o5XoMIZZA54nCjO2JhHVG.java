
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Object obj1 = "Hello";
        Object obj2 = 42;
        Object obj3 = new Person("Alice");
        Object obj4 = new int[]{1, 2, 3};
        
        System.out.println(switchExpression(obj1)); // String case
        System.out.println(switchExpression(obj2)); // Integer case
        System.out.println(switchExpression(obj3)); // Custom object case
        System.out.println(switchExpression(obj4)); // Array case
        System.out.println(switchExpression(null));  // Null case
    }

    static String switchExpression(Object obj) {
        return switch (obj) {
            case String s -> "String: " + s;
            case Integer i when i > 0 -> "Positive Integer: " + i;
            case Integer i -> "Integer: " + i;
            case Person p -> "Person: " + p.getName();
            case int[] arr when arr.length > 0 -> "Array of length: " + arr.length;
            case null -> "Null value";
            default -> "Unknown type: " + obj.getClass().getName();
        };
    }
}

class Person {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
