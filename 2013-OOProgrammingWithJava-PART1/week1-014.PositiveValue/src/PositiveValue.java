
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type a number: ");
        int a = Integer.parseInt(in.nextLine());
        if (a > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is not positive.");
        }
        // Type your program here:
    }
}
