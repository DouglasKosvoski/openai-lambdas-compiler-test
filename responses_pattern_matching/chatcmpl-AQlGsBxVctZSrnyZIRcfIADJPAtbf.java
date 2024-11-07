
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Object> inputs = Arrays.asList("Hello", 100, 45.67, new int[]{1, 2, 3}, Optional.of("Value"), null);

        for (Object input : inputs) {
            String result = match(input);
            System.out.println("Input: " + input + " -> Result: " + result);
        }
    }

    static String match(Object obj) {
        return switch (obj) {
            case String s -> "String: " + s.toUpperCase();
            case Integer i when i > 50 -> "Large Integer: " + (i * 2);
            case Integer i -> "Small Integer: " + (i + 10);
            case Double d when d < 50.0 -> "Small Double: " + d;
            case Double d -> "Large Double: " + (d / 2);
            case int[] arr -> "Array Length: " + arr.length;
            case Optional<?> opt && opt.isPresent() -> "Present Optional: " + opt.get();
            case null -> "Null value detected";
            default -> "Unknown type: " + obj.getClass().getSimpleName();
        };
    }
}
