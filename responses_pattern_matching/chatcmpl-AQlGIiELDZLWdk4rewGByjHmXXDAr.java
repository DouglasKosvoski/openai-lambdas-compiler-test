
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Object[] testCases = { "Hello", 42, null, new int[]{1, 2, 3}, new Integer[5], "World", 3.14, true };

        for (Object testCase : testCases) {
            switch (testCase) {
                case String s -> System.out.println("String: " + s.toUpperCase());
                case Integer i -> System.out.println("Integer: " + (i + 10));
                case int[] arr -> System.out.println("Array of int: " + arr.length);
                case Object obj -> System.out.println("Object: " + obj.toString());
                case null -> System.out.println("Null case");
                case Double d -> System.out.println("Double: " + (d * 2));
                case Boolean b && b -> System.out.println("Boolean: true");
                case Boolean b && !b -> System.out.println("Boolean: false");
                case var v -> System.out.println("Generic case: " + v);
                default -> System.out.println("Default case");
            }
        }

        System.out.println(demoPatternMatching(new Circle(5)));
        System.out.println(demoPatternMatching(new Rectangle(5, 10)));
        System.out.println(demoPatternMatching(new Square(7)));
    }

    static String demoPatternMatching(Shape shape) {
        switch (shape) {
            case Circle c -> "Circle with radius: " + c.radius;
            case Rectangle r -> "Rectangle with width: " + r.width + " and height: " + r.height;
            case Square s -> "Square with side: " + s.side;
            case null -> "No shape provided";
            default -> "Unknown shape";
        }
    }
}

sealed interface Shape permits Circle, Rectangle, Square {
}

final class Circle implements Shape {
    final double radius;

    Circle(double radius) {
        this.radius = radius;
    }
}

final class Rectangle implements Shape {
    final double width;
    final double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
}

final class Square implements Shape {
    final double side;

    Square(double side) {
        this.side = side;
    }
}
