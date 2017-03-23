import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int a, count = 0, even = 0, odd = 0;
        double sum = 0;
        System.out.println("Type numbers: ");
        while (true) {
            a = Integer.parseInt(reader.nextLine());
            if (a != -1) {
                sum += a;
                count++;
                if (a % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            } else {
                System.out.println("Thank you and see you later");
                break;
            }
        }
        System.out.println("The sum is " + (int)sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + sum/count);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }     
}