package GroupExercise2.Task06;

public class ShapeTester {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Square square = new Square(6);

        System.out.println("Circle area is " + circle.calculateArea());
        System.out.println("Circle perimeter is " + circle.calculatePerimeter());
        System.out.println("Square area is " + square.calculateArea());
        System.out.println("Square perimeter is " + square.calculatePerimeter());
    }
}