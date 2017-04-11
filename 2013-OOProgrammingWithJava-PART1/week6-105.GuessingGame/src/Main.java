
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // test your program here
        Scanner in = new Scanner(System.in);
        GuessingGame letsplay = new GuessingGame();
        letsplay.play(1, 100);
    }    
}
