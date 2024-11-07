
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Object[] testCases = { "Hello", 123, 45.67, new int[]{1, 2, 3}, null, "World", 456, new String[]{"Java"}, -3.14, 'A', "Check", new Object() };

        for (Object testCase : testCases) {
            System.out.println(switchPattern(testCase));
        }
    }

    static String switchPattern(Object obj) {
        return switch (obj) {
            case String s && s.length() > 5 -> "String longer than 5: " + s;
            case String s -> "String: " + s;
            case Integer i && i > 100 -> "Integer greater than 100: " + i;
            case Integer i -> "Integer: " + i;
            case Double d && d < 0 -> "Negative Double: " + d;
            case Double d -> "Double: " + d;
            case int[] arr && arr.length > 0 -> "Array of ints: " + printArray(arr);
            case int[] arr -> "Empty Array of ints";
            case null -> "Null object";
            case Character c -> "Character: " + c;
            case default -> "Unknown type: " + obj.getClass().getSimpleName();
        };
    }

    static String printArray(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
