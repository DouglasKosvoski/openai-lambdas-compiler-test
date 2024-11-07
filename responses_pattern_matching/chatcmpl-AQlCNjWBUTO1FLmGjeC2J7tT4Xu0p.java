
import java.util.Objects;

class Main {
    public static void main(String[] args) {
        Object obj1 = "Hello";
        Object obj2 = 42;
        Object obj3 = 3.14;
        Object obj4 = new int[]{1, 2, 3};

        System.out.println(patternMatch(obj1));
        System.out.println(patternMatch(obj2));
        System.out.println(patternMatch(obj3));
        System.out.println(patternMatch(obj4));
        System.out.println(patternMatch(null));
    }

    static String patternMatch(Object obj) {
        return switch (obj) {
            case String s -> "String of length " + s.length();
            case Integer i when i > 0 -> "Positive Integer: " + i;
            case Integer i -> "Integer: " + i;
            case Double d -> "Double: " + d;
            case int[] arr when arr.length > 0 -> "Array of size: " + arr.length;
            case int[] arr -> "Empty array";
            case null -> "Null object";
            default -> "Unknown type";
        };
    }
}
