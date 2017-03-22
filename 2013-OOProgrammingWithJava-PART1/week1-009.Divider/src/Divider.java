
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        float a = in.nextInt();
        System.out.println("Type a number: ");
        float b = in.nextInt();
        float result = a / b;
        System.out.println("\nDivision: " + a + " / " + b + " = " + result);

        // Implement your program here. Remember to ask the input from user.
    }
}
