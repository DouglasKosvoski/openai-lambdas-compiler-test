
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println(switchPatternMatching(1));
        System.out.println(switchPatternMatching(2L));
        System.out.println(switchPatternMatching("Hello"));
        System.out.println(switchPatternMatching(Optional.of(3)));
        System.out.println(switchPatternMatching(new Point(4, 5)));
        System.out.println(switchPatternMatching(new Object()));
    }

    static String switchPatternMatching(Object obj) {
        return switch (obj) {
            case Integer i && i < 10 -> "Integer less than 10: " + i;
            case Integer i && i >= 10 -> "Integer 10 or more: " + i;
            case Long l -> "It's a Long: " + l;
            case String s when s.length() > 5 -> "Long String: " + s;
            case String s -> "Short String: " + s;
            case Optional<?> opt && opt.isPresent() ? opt.get() : null -> "Present Optional: " + opt.get();
            case Point p -> "Point at: " + p;
            case null -> "It's null!";
            default -> "Unknown type: " + obj.getClass().getSimpleName();
        };
    }

    static record Point(int x, int y) {}
}
