import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program
        
        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        ArrayList<Integer> scores = new ArrayList<Integer>();
        int h = 0, count = 0;
        System.out.println("Type exam scores, -1 completes:");
        do {
            h = Integer.parseInt(reader.nextLine());
            if (h >=0 && h <= 60) {
                scores.add(h);
            }
        } while (h != -1);
        
        int zero = 0, one = 0, two = 0, three = 0, four = 0, five = 0;
        for(int item : scores) {
            if (item >= 50 && item <= 60) {
                five++;
            }
            if (item >= 45 && item <= 49) {
                four++;
            }
            if (item >= 40 && item <= 44) {
                three++;
            }
            if (item >= 35 && item <= 39) {
                two++;
            }
            if (item >= 30 && item <= 34) {
                one++;
            }
            if (item >= 0 && item <= 29) {
                zero++;
            }
        }
        System.out.println(scores);
        
        System.out.println("Grade distribution: ");
        
        System.out.print("5: ");
        for(int i = 0; i < five; i++) {
            System.out.print("*");  
        }
        System.out.println("");
        System.out.print("4: ");
        for(int i = 0; i < four; i++) {
            System.out.print("*");  
        }
        System.out.println("");
        System.out.print("3: ");
        for(int i = 0; i < three; i++) {
            System.out.print("*");  
        }
        System.out.println("");
        System.out.print("2: ");
        for(int i = 0; i < two; i++) {
            System.out.print("*");  
        }
        System.out.println("");
        System.out.print("1: ");
        for(int i = 0; i < one; i++) {
            System.out.print("*");  
        }
        System.out.println("");
        System.out.print("0: ");
        for(int i = 0; i < zero; i++) {
            System.out.print("*");  
        }
        System.out.println("");
        
        double x = (double)scores.size();
        double ans = 100 * ((x - zero) / x);
        System.out.println("Acceptance percentage: " + ans);
    }
}