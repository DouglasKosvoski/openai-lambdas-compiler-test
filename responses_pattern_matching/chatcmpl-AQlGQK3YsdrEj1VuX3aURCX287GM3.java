
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Object[] testCases = {
            1, "Hello", new Object[]{1, 2}, Double.valueOf(3.14),
            null, 3.14f, Arrays.asList("A", "B", "C"), "World!",
            new int[]{1, 2}, new Object()
        };

        for (Object testCase : testCases) {
            System.out.println(switchTest(testCase));
        }
    }

    static String switchTest(Object obj) {
        return switch (obj) {
            case Integer i -> "Integer: " + i;
            case String s when s.length() > 5 -> "Long String: " + s;
            case String s -> "Short String: " + s;
            case int[] arr when arr.length > 2 -> "Array of ints: " + Arrays.toString(arr);
            case Object[] arr when arr.length > 0 && arr[0] instanceof Integer -> "Array of Integers: " + Arrays.toString(arr);
            case double d && d > 3 -> "Large Double: " + d;
            case float f && f < 4 -> "Small Float: " + f;
            case null -> "Null encountered!";
            default -> "Unknown type: " + obj.getClass().getName();
        };
    }
}
