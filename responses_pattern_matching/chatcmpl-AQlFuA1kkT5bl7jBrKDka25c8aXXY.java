
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(switchPattern(1));
        System.out.println(switchPattern("Hello"));
        System.out.println(switchPattern(3.14));
        System.out.println(switchPattern(List.of(1, 2, 3)));
        System.out.println(switchPattern(new Object()));
        System.out.println(switchPattern(new int[]{1, 2, 3}));
        System.out.println(switchPattern(new double[]{1.1, 2.2, 3.3}));
    }

    public static String switchPattern(Object obj) {
        return switch (obj) {
            case Integer i && i > 0 -> "Positive Integer: " + i;
            case Integer i && i < 0 -> "Negative Integer: " + i;
            case Integer i -> "Zero Integer";
            case String s && s.length() > 5 -> "Long String: " + s;
            case String s -> "Short String: " + s;
            case Double d -> "Double value: " + d;
            case List<?> list && !list.isEmpty() -> "Non-empty List of size: " + list.size();
            case List<?> list -> "Empty List";
            case int[] arr -> "Array of size: " + arr.length;
            case double[] arr -> "Double Array of size: " + arr.length;
            case null -> "Null value";
            default -> "Unexpected Object: " + obj.getClass().getSimpleName();
        };
    }
}
