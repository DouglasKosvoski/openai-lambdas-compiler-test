
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> inputs = Arrays.asList(1, 2.0, "Hello", new int[]{1, 2}, new Object[]{1, "Test"}, new CustomType(), null);
        for (Object input : inputs) {
            System.out.println(switchMatch(input));
        }
    }

    static String switchMatch(Object obj) {
        return switch (obj) {
            case Integer i -> "Integer: " + i;
            case Double d -> "Double: " + d;
            case String s -> "String: " + s;
            case int[] arr -> "Array of ints: " + Arrays.toString(arr);
            case Object[] objArr -> "Array of Objects: " + Arrays.toString(objArr);
            case CustomType ct -> "CustomType instance";
            case null -> "Null value";
            default -> "Unknown type: " + obj.getClass().getName();
        };
    }

    static class CustomType {}
}
