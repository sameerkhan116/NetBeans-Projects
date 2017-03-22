
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type a year: ");
        int a = Integer.parseInt(in.nextLine());
        if (a % 4 == 0) {
            if (a % 100 == 0 && a % 400 != 0) {
                System.out.println("The year is not a leap year.");
            } else {
                System.out.println("The year is a leap year.");
            }    
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
