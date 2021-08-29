package task_1_2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle(8);
        Shape square = new Square(10);
        Shape rect = new Rect(15, 5);
        Shape triangle = new Triangle(7, 5, 8);

        List<Shape> list = Arrays.asList(circle, square, rect, triangle);

        System.out.println("all shapes: ");
        list.forEach(System.out::println);
        System.out.println("\nsquares of figures:");
        list.forEach(shape -> System.out.print("square of " + shape.getClass().getSimpleName()
                + " = " + shape.calculateSquare() + "\n"));

        System.out.println("\nperimeters of figures:");
        list.forEach(shape -> System.out.print("perimeter of " + shape.getClass().getSimpleName()
                + " = " + shape.calculatePerimeter() + "\n"));

    }
}
