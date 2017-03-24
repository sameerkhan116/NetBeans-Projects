
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String text = reader.nextLine();
        for(int i = 1; i <= text.length(); i++) {
                System.out.println(i + ". character: " + text.charAt(i-1));
            } 
    }
}
