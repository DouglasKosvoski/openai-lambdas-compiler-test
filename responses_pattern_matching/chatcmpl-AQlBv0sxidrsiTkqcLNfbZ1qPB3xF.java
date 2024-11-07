
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println(switchPatternMatching("Hello"));
        System.out.println(switchPatternMatching(42));
        System.out.println(switchPatternMatching(3.14));
        System.out.println(switchPatternMatching(new int[]{1, 2, 3}));
        System.out.println(switchPatternMatching(NullObject.INSTANCE));
    }

    public static String switchPatternMatching(Object obj) {
        return switch (obj) {
            case null -> "Received null";
            case String s && s.startsWith("H") -> "Greeting matched: " + s;
            case Integer i && i > 0 -> "Positive integer: " + i;
            case Integer i -> "Integer: " + i;
            case Double d && d > 0.0 -> "Positive double: " + d;
            case Double d -> "Double: " + d;
            case int[] arr && arr.length > 0 -> "Array with length: " + arr.length;
            case int[] arr -> "Empty array";
            case NullObject.INSTANCE -> "Received NullObject";
            default -> "Unknown type: " + obj.getClass().getSimpleName();
        };
    }
    
    private static final class NullObject {
        private static final NullObject INSTANCE = new NullObject();
        
        private NullObject() {}
    }
}
