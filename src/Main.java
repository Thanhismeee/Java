import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Validation valid = new Validation();
        
        Shape rectangle = new Rectangle();
        rectangle.input(valid);
        
        Shape circle = new Circle();
        circle.input(valid);

        Shape triangle = new Triangle();
        triangle.input(valid);
        
        rectangle.printResult();
        circle.printResult();
        triangle.printResult();
    }
}
