
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a, b;
        System.out.println("First: ");
        a = Integer.parseInt(reader.nextLine());
        System.out.println("Second: ");
        b = Integer.parseInt(reader.nextLine());
        while (a <= b) {
            System.out.println(a);
            a++;
        }
        // write your code here

    }
}
