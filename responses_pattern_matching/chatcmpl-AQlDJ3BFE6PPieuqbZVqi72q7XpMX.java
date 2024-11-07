
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(switchPattern("Hello"));
        System.out.println(switchPattern(25));
        System.out.println(switchPattern(3.14));
        System.out.println(switchPattern(List.of(1, 2, 3)));
        System.out.println(switchPattern(new CustomType(42)));
        System.out.println(switchPattern(new Object()));
    }

    static String switchPattern(Object obj) {
        return switch (obj) {
            case String s -> "It's a string: " + s;
            case Integer i when i > 0 -> "Positive integer: " + i;
            case Integer i -> "It's an integer: " + i;
            case Double d when d > 0 -> "Positive double: " + d;
            case Double d -> "It's a double: " + d;
            case List<?> list when list.isEmpty() -> "Empty list";
            case List<?> list -> "List with size: " + list.size();
            case CustomType ct -> "Custom type value: " + ct.value;
            case null -> "It's null";
            default -> "Unknown type: " + obj.getClass().getName();
        };
    }

    static class CustomType {
        int value;

        CustomType(int value) {
            this.value = value;
        }
    }
}
