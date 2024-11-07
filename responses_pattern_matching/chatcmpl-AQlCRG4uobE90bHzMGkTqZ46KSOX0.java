
import java.util.Objects;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Object obj1 = "Hello";
        Object obj2 = 5;
        Object obj3 = new int[]{1, 2, 3};
        Object obj4 = List.of(1, 2, 3);
        Object obj5 = new StringBuilder("Builder");
        
        System.out.println(switchPattern(obj1));
        System.out.println(switchPattern(obj2));
        System.out.println(switchPattern(obj3));
        System.out.println(switchPattern(obj4));
        System.out.println(switchPattern(obj5));
    }

    static String switchPattern(Object obj) {
        return switch (obj) {
            case String s -> "It's a string of length " + s.length();
            case Integer i when i > 0 -> "It's a positive integer: " + i;
            case Integer i -> "It's a non-positive integer: " + i;
            case int[] arr && arr.length > 0 -> "It's an array of integers of length " + arr.length;
            case List<?> list && !list.isEmpty() -> "It's a non-empty list of size " + list.size();
            case StringBuilder sb -> "It's a StringBuilder with length " + sb.length();
            case null -> "It's null";
            default -> "Unknown type: " + obj.getClass().getName();
        };
    }
}
