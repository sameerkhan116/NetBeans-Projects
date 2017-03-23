
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a, b, sum = 0;
        System.out.println("First: ");
        a = Integer.parseInt(reader.nextLine());
        System.out.println("Second: ");
        b = Integer.parseInt(reader.nextLine());
        while (a <= b) {
            sum += a;
            a++;  
        }
        System.out.println(sum);
    }
}
