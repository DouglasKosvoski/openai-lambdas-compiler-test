
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Object[] inputs = {10, 20.5, "hello", List.of(1, 2, 3), Optional.of("optional"), null, new int[]{1, 2, 3}};
        
        for (Object input : inputs) {
            System.out.println("Input: " + input + " -> " + match(input));
        }
    }

    static String match(Object input) {
        return switch (input) {
            case Integer i -> "Integer: " + i;
            case Double d && d > 10.0 -> "High Double: " + d;
            case Double d -> "Double: " + d;
            case String s && s.length() > 5 -> "Long String: " + s;
            case String s -> "Short String: " + s;
            case List<?> list -> "List of size: " + list.size();
            case Optional<?> optional && optional.isPresent() -> "Present Optional: " + optional.get();
            case Optional<?> optional -> "Empty Optional";
            case null -> "Null Value";
            case int[] arr -> "Array of length: " + arr.length;
            default -> "Unknown Type";
        };
    }
}
