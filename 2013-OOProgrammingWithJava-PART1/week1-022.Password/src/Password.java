
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot";
        String a;
        while (true) {
            System.out.println("Type the password: ");
            a = reader.nextLine();
            if (a.equals(password)) {
                System.out.println("Right!");
                System.out.println("\nThe secret is: jryy qbar!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
        // Write your code here
    }
}
