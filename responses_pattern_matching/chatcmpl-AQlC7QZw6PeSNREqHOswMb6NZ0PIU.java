
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Object input1 = "Hello World";
        Object input2 = 42;
        Object input3 = new int[]{1, 2, 3};
        Object input4 = new Person("John", 30);
        
        System.out.println(match(input1));
        System.out.println(match(input2));
        System.out.println(match(input3));
        System.out.println(match(input4));
        System.out.println(match(null));
    }

    static String match(Object obj) {
        return switch (obj) {
            case String s -> "String: " + s;
            case Integer i when i > 0 -> "Positive Integer: " + i;
            case Integer i -> "Non-positive Integer: " + i;
            case int[] arr -> "Array of size " + arr.length + ": " + java.util.Arrays.toString(arr);
            case Person p when p.age > 18 -> "Adult: " + p.name;
            case Person p -> "Minor: " + p.name;
            case null -> "Nothing here!";
            default -> "Unknown Type";
        };
    }

    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
