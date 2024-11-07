
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(matchShape(new Circle(5)));
        System.out.println(matchShape(new Rectangle(4, 6)));
        System.out.println(matchShape(new Square(3)));
        System.out.println(matchShape(new Triangle(3, 4, 5)));
        System.out.println(matchShape(new UnknownShape()));
        
        Object obj = "Hello";
        System.out.println(matchObj(obj));
        obj = 42;
        System.out.println(matchObj(obj));
        obj = List.of(1, 2, 3);
        System.out.println(matchObj(obj));
    }

    static String matchShape(Shape shape) {
        return switch (shape) {
            case Circle c -> "Circle with radius: " + c.radius;
            case Rectangle r -> "Rectangle with width: " + r.width + " and height: " + r.height;
            case Square s -> "Square with side: " + s.side;
            case Triangle t -> "Triangle with sides: " + t.a + ", " + t.b + ", " + t.c;
            default -> "Unknown Shape";
        };
    }
    
    static String matchObj(Object obj) {
        return switch (obj) {
            case String s -> "String of length: " + s.length();
            case Integer i && i > 0 -> "Positive Integer: " + i;
            case Integer i -> "Integer: " + i;
            case List<?> l when l.isEmpty() -> "Empty List";
            case List<?> l -> "List with size: " + l.size();
            default -> "Unknown Object";
        };
    }

    sealed interface Shape permits Circle, Rectangle, Square, Triangle, UnknownShape {}
    
    static final class Circle implements Shape {
        int radius;
        Circle(int radius) { this.radius = radius; }
    }
    
    static final class Rectangle implements Shape {
        int width, height;
        Rectangle(int width, int height) { this.width = width; this.height = height; }
    }

    static final class Square implements Shape {
        int side;
        Square(int side) { this.side = side; }
    }

    static final class Triangle implements Shape {
        int a, b, c;
        Triangle(int a, int b, int c) { this.a = a; this.b = b; this.c = c; }
    }
    
    static final class UnknownShape implements Shape {}
}
