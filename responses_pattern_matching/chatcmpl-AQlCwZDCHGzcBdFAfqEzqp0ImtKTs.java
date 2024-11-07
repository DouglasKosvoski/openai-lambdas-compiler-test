
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Object testValue1 = "Hello";
        Object testValue2 = 42;
        Object testValue3 = new int[]{1, 2, 3};
        Object testValue4 = null;

        System.out.println(patternMatch(testValue1));
        System.out.println(patternMatch(testValue2));
        System.out.println(patternMatch(testValue3));
        System.out.println(patternMatch(testValue4));
    }

    public static String patternMatch(Object obj) {
        return switch (obj) {
            case String s -> "Matched a String: " + s.toUpperCase();
            case Integer i when i > 0 -> "Matched a positive Integer: " + (i * 2);
            case Integer i -> "Matched a non-positive Integer: " + i;
            case int[] arr && arr.length > 0 -> "Matched an array of integers: " + java.util.Arrays.toString(arr);
            case null -> "Matched null value";
            case Object o -> "Matched some other Object: " + o.toString();
            default -> "No match found";
        };
    }

    public static String complexPatternMatch(Object obj) {
        return switch (obj) {
            case String s && s.length() > 3 -> "Long String: " + s;
            case String s -> "Short String: " + s;
            case Integer i when i % 2 == 0 -> "Even Integer: " + i;
            case Integer i -> "Odd Integer: " + i;
            case double d -> "Matched a double: " + d;
            case Object[] array && array.length > 0 -> "Array of Objects: " + java.util.Arrays.deepToString(array);
            default -> throw new IllegalStateException("Unexpected value: " + obj);
        };
    }

    public static String deepNestedPatternMatch(Object obj) {
        return switch (obj) {
            case String s && s.length() > 0 -> "Non-empty String: " + s;
            case Integer i -> switch (i) {
                case 0 -> "Zero Integer";
                case 1, 2 -> "Small Integer: " + i;
                default -> "Larger Integer: " + i;
            };
            case int[] arr -> switch (arr.length) {
                case 0 -> "Empty Array";
                case 1 -> "Single element array: " + arr[0];
                default -> "Array of length: " + arr.length;
            };
            default -> "Unknown type or structure";
        };
    }
}
