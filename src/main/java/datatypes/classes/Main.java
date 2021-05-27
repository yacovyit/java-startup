package datatypes.classes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(1);
        Shape rectangle = new Rectangle(3, 5);

        System.out.println("Circle area = " + circle.area());
        System.out.println("rectangle area = " + rectangle.area());

        Shape[] shapes = new Shape[2];
        shapes[0] = circle;
        shapes[1] = rectangle;

        for (Shape shape: shapes) {
            System.out.println(shape);
        }
    }
}
