
import java.util.Scanner;

public class Validation {

    Scanner sc = new Scanner(System.in);

    public double checkInputDouble(String message) {
        System.out.print(message);
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine().trim());
                if (result <= 0) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please input a positive number!");
                System.out.print("Enter again: ");
            }
        }
    }
}
