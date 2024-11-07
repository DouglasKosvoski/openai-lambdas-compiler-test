
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(switchPatternMatch("Hello"));
        System.out.println(switchPatternMatch(123));
        System.out.println(switchPatternMatch(List.of(1, 2, 3)));
        System.out.println(switchPatternMatch(new Object()));
        System.out.println(switchPatternMatch(3.14));
        System.out.println(switchPatternMatch(null));
        System.out.println(switchPatternMatch(new int[]{1, 2, 3}));
    }

    public static String switchPatternMatch(Object obj) {
        return switch (obj) {
            case String s -> "String with length: " + s.length();
            case Integer i when i < 0 -> "Negative Integer: " + i;
            case Integer i -> "Integer: " + i;
            case List<?> list && !list.isEmpty() -> "Non-empty List of size: " + list.size();
            case List<?> list -> "Empty List";
            case int[] arr -> "Array of length: " + arr.length;
            case Double d -> "Double value: " + d;
            case null -> "Null value";
            default -> "Unknown type";
        };
    }
}
