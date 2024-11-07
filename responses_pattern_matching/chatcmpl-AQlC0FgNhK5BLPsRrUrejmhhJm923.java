
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println(matchShape(new Circle(5)));
        System.out.println(matchShape(new Rectangle(4, 6)));
        System.out.println(matchShape(new Triangle(3, 4, 5)));
        System.out.println(matchShape(new Object()));
    }

    static String matchShape(Object shape) {
        return switch (shape) {
            case Circle c -> "Circle with radius: " + c.getRadius();
            case Rectangle r -> "Rectangle with width: " + r.getWidth() + " and height: " + r.getHeight();
            case Triangle t -> "Triangle with sides: " + t.getSideA() + ", " + t.getSideB() + ", " + t.getSideC();
            case null -> "Shape is null";
            default -> "Unknown shape";
        };
    }

    static class Circle {
        private final double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        double getRadius() {
            return radius;
        }
    }

    static class Rectangle {
        private final double width;
        private final double height;

        Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        double getWidth() {
            return width;
        }

        double getHeight() {
            return height;
        }
    }

    static class Triangle {
        private final double sideA;
        private final double sideB;
        private final double sideC;

        Triangle(double sideA, double sideB, double sideC) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        }

        double getSideA() {
            return sideA;
        }

        double getSideB() {
            return sideB;
        }

        double getSideC() {
            return sideC;
        }
    }
}
