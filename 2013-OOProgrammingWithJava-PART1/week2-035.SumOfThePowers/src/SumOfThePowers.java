
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i = 0, sum = 0;
        System.out.println("Type a number: ");
        int a = Integer.parseInt(reader.nextLine());
        while (i <= a) {
            sum += Math.pow(2,i);
            i++;
        }
        System.out.println(sum);
    }
}
