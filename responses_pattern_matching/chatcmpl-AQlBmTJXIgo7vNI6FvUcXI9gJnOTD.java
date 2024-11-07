
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(executeSwitch("hi"));
        System.out.println(executeSwitch(42));
        System.out.println(executeSwitch(List.of("one", "two", "three")));
        System.out.println(executeSwitch(null));
        System.out.println(executeSwitch(3.14));
    }

    static String executeSwitch(Object obj) {
        return switch (obj) {
            case String s -> "String value: " + s;
            case Integer i when i > 10 -> "Large Integer: " + i;
            case Integer i -> "Small Integer: " + i;
            case List<?> l when l.isEmpty() -> "Empty List";
            case List<?> l -> "List of size: " + l.size();
            case null -> "Null value";
            case Double d -> "Double value: " + d;
            default -> "Unknown type: " + obj.getClass().getSimpleName();
        };
    }
}
