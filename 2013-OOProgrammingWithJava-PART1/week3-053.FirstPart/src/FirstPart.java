
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);   
        System.out.println("Type a word: ");
        String text = reader.nextLine();
        System.out.println("Length of first part: ");
        int n = Integer.parseInt(reader.nextLine());
        System.out.println("Result: " + text.substring(0, n));
    }
}
