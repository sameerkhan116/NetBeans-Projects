
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type your username: ");
        String user = in.nextLine();
        System.out.println("Type your password: ");
        String pass = in.nextLine();
        if ((user.equals("alex") && pass.equals("mightyducks")) || (user.equals("emily") && pass.equals("cat"))) {
            System.out.println("You are now logged into the system!");
        } else {
            System.out.println("Your username or password was invalid!");
        }
    }
}
