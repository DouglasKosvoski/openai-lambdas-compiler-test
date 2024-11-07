
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Object obj1 = "Hello, World!";
        Object obj2 = 42;
        Object obj3 = new int[]{1, 2, 3};
        Object obj4 = null;
        Object obj5 = new CustomType("Example");
        
        System.out.println(handle(obj1));
        System.out.println(handle(obj2));
        System.out.println(handle(obj3));
        System.out.println(handle(obj4));
        System.out.println(handle(obj5));
        System.out.println(handle(new String[]{"A", "B", "C"}));
        System.out.println(handle(new CustomType("Test")));
    }

    static String handle(Object obj) {
        return switch (obj) {
            case String s -> "It's a string: " + s;
            case Integer i -> "It's an integer: " + i;
            case int[] arr -> "It's an array: " + java.util.Arrays.toString(arr);
            case null -> "It's null!";
            case CustomType ct -> "It's a custom type: " + ct.getName();
            case Object[] objs -> "It's an object array: " + java.util.Arrays.toString(objs);
            case default -> "Unknown type!";
        };
    }

    static class CustomType {
        private final String name;

        public CustomType(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
