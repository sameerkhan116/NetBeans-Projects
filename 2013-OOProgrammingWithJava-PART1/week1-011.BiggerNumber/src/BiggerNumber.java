
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type a number: ");
        int a = in.nextInt();
        System.out.println("Type another number: ");
        int b = in.nextInt();
        int result = Math.max(a, b);
        
        System.out.println("\nThe bigger of the two numbers given was: " + result);
        // Implement your program here. Remember to ask the input from user
    }
}
