
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Type your name: ");
        String name1 = in.nextLine();
        System.out.println("Type your age: ");
        int a = Integer.parseInt(in.nextLine());
        System.out.println("\nType your name: ");
        String name2 = in.nextLine();
        System.out.println("Type your age: ");
        int b = Integer.parseInt(in.nextLine());
        // Implement your program here
        int totage = a + b;
        System.out.println(name1 + " and " + name2 + " are " + totage + " years old in total.");
    }
}
