
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println(matchShape(new Circle(5)));
        System.out.println(matchShape(new Rectangle(4, 6)));
        System.out.println(matchShape(new Triangle(3, 4, 5)));
        System.out.println(matchShape("hello"));
        System.out.println(matchShape(42));
        System.out.println(matchShape(null));
        System.out.println(matchShape(new Object()));
    }

    static String matchShape(Object shape) {
        return switch (shape) {
            case Circle c -> "Circle with radius: " + c.radius;
            case Rectangle r -> "Rectangle with width: " + r.width + " and height: " + r.height;
            case Triangle t -> "Triangle with sides: " + t.a + ", " + t.b + ", " + t.c;
            case String s && s.length() > 3 -> "String longer than 3 characters: " + s;
            case Integer i && i > 10 -> "Integer greater than 10: " + i;
            case null -> "Null value";
            default -> "Unknown shape or type";
        };
    }

    static record Circle(int radius) {}
    static record Rectangle(int width, int height) {}
    static record Triangle(int a, int b, int c) {}
}
