
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(switchExample("Hello"));
        System.out.println(switchExample(42));
        System.out.println(switchExample(List.of(1, 2, 3)));
        System.out.println(switchExample(new Point(3, 4)));
        System.out.println(switchExample(new Point(0, 0)));
        System.out.println(switchExample(new Object()));
    }

    static String switchExample(Object obj) {
        return switch (obj) {
            case String s -> "String of length " + s.length();
            case Integer i when i > 0 && i < 100 -> "Positive Integer: " + i;
            case List<?> list when list.size() > 3 -> "List with more than 3 elements: " + list.size();
            case Point p when p.x == 0 && p.y == 0 -> "Origin Point";
            case Point p -> "Point at (" + p.x + ", " + p.y + ")";
            case null -> "Null object";
            default -> "Unsupported type: " + obj.getClass().getSimpleName();
        };
    }

    static class Point {
        int x, y;
        
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
