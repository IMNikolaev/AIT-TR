package lesson_22.figs;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(2);
        shapes[1] = new Triangle(2,3);
        shapes[2] = new Square(2);

        for (int i=0; i< shapes.length; i++) {
            System.out.println("Calculate Area: " + shapes[i].calculateArea());
        }
    }
}
