
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Object obj1 = "Hello";
        Object obj2 = 123;
        Object obj3 = 45.67;
        Object obj4 = new int[]{1, 2, 3};
        Object obj5 = new CustomClass("Custom");

        System.out.println(patternMatch(obj1));
        System.out.println(patternMatch(obj2));
        System.out.println(patternMatch(obj3));
        System.out.println(patternMatch(obj4));
        System.out.println(patternMatch(obj5));
        System.out.println(patternMatch(null));
        System.out.println(patternMatch("Unknown"));
    }

    static String patternMatch(Object obj) {
        return switch (obj) {
            case String s -> "Matched String: " + s;
            case Integer i -> "Matched Integer: " + i;
            case Double d -> "Matched Double: " + d;
            case int[] arr when arr.length > 2 -> "Matched int array of length > 2: " + arr.length;
            case CustomClass cc -> "Matched CustomClass: " + cc.getValue();
            case null -> "Matched null value";
            default -> "No match found";
        };
    }

    static class CustomClass {
        private final String value;

        CustomClass(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
