import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int fact = 1, i = 1;
        System.out.println("Type a number: ");
        int a = Integer.parseInt(reader.nextLine());
        while (i <= a) {
            fact *= i;
            i++;  
        }
        System.out.println(fact);
    }
}