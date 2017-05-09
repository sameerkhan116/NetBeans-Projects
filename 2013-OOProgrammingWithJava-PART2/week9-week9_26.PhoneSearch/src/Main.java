
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        TextView ui = new TextView();
        Scanner reader = new Scanner(System.in);
        Operations ops = new Operations(reader);
        ui.welcomeMessage();
        
        
    }
}
