
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Object obj = "Hello";
        System.out.println(switchExample(obj));

        obj = 42;
        System.out.println(switchExample(obj));

        obj = new int[]{1, 2, 3};
        System.out.println(switchExample(obj));

        obj = null;
        System.out.println(switchExample(obj));

        obj = new ClassA();
        System.out.println(switchExample(obj));

        obj = new ClassB();
        System.out.println(switchExample(obj));
    }

    static String switchExample(Object obj) {
        return switch (obj) {
            case String s -> "It's a string: " + s;
            case Integer i when i > 0 -> "Positive integer: " + i;
            case Integer i -> "Non-positive integer: " + i;
            case int[] arr && arr.length > 0 -> "Array with length: " + arr.length;
            case null -> "It's null";
            case ClassA a -> "ClassA instance: " + a.toString();
            case ClassB b -> "ClassB instance: " + b.toString();
            default -> "Unknown type";
        };
    }

    static class ClassA {
        @Override
        public String toString() {
            return "I am ClassA";
        }
    }

    static class ClassB {
        @Override
        public String toString() {
            return "I am ClassB";
        }
    }
}
