
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How old are you? ");
        int a = Integer.parseInt(in.nextLine());
        if (a >= 0 && a <= 120) {
            System.out.println("OK");
        } else if (a < 0 || a > 120) {
            System.out.println("Impossible!");
        }
    }
}
