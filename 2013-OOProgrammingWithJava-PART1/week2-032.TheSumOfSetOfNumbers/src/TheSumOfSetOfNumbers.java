
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a, sum = 0;
        int i = 1;
        System.out.println("Until what? ");
        a = Integer.parseInt(reader.nextLine());
        while (i <= a) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
