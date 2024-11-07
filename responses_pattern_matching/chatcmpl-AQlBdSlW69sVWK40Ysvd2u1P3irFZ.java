
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Object obj1 = "Hello";
        Object obj2 = 42;
        Object obj3 = new Point(3, 4);
        Object obj4 = new Shape("Circle", 5);

        System.out.println(switchPattern(obj1));
        System.out.println(switchPattern(obj2));
        System.out.println(switchPattern(obj3));
        System.out.println(switchPattern(obj4));
        System.out.println(switchPattern(new int[]{1, 2, 3}));
    }

    static String switchPattern(Object obj) {
        return switch (obj) {
            case String s -> "String: " + s;
            case Integer i when i > 0 -> "Positive Integer: " + i;
            case Integer i -> "Integer: " + i;
            case Point p -> "Point at (" + p.x() + ", " + p.y() + ")";
            case Shape s -> "Shape: " + s.name() + ", Area: " + s.area();
            case int[] arr -> "Array of size: " + arr.length;
            case null -> "Null object";
            default -> "Unknown type: " + obj.getClass().getName();
        };
    }

    static record Point(int x, int y) {}
    static class Shape {
        String name;
        int radius;

        Shape(String name, int radius) {
            this.name = name;
            this.radius = radius;
        }

        String name() {
            return name;
        }

        double area() {
            return Math.PI * radius * radius;
        }
    }
}
