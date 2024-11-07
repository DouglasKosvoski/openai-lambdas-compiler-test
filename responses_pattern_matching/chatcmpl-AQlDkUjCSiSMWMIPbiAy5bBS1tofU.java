
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(matchShape(new Circle(5)));
        System.out.println(matchShape(new Rectangle(4, 6)));
        System.out.println(matchShape(new Triangle(3, 4, 5)));
        System.out.println(matchShape("Hello"));
        System.out.println(matchShape(42));
        System.out.println(matchShape(List.of(1, 2, 3)));
    }

    static String matchShape(Object shape) {
        return switch (shape) {
            case Circle c -> "Circle with radius: " + c.getRadius();
            case Rectangle r -> "Rectangle with area: " + (r.getWidth() * r.getHeight());
            case Triangle t when t.isValid() -> "Triangle with sides: " + t.getSides();
            case String s -> "String of length: " + s.length();
            case Integer i -> "Integer value: " + i;
            case List<?> l -> "List size: " + l.size();
            default -> "Unknown shape";
        };
    }

    static class Circle {
        private final double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
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

        public double getWidth() {
            return width;
        }

        public double getHeight() {
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

        public boolean isValid() {
            return sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
        }

        public double[] getSides() {
            return new double[]{sideA, sideB, sideC};
        }
    }
}
