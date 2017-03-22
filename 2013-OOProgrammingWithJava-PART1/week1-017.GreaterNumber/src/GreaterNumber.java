import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type the first number: ");
        int a = Integer.parseInt(in.nextLine());
        System.out.println("Type the second number: ");
        int b = Integer.parseInt(in.nextLine());
        
        if (a > b) {
            System.out.println("Greater number: " + a);
        } else if (b > a) {
            System.out.println("Greater number: " + b);
        } else if (a == b) {
            System.out.println("The numbers are equal!");
        }
    }
}
