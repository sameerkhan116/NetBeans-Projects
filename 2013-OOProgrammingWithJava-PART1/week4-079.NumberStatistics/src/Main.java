import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sEven = 0, sOdd = 0;
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        System.out.println("Type numbers: ");
        
        while(true) {
            int h = Integer.parseInt(reader.nextLine());
            if(h == -1) {
                break;
            } else {
                stats.addNumber(h);
                if(h%2 == 0) {
                    even.addNumber(h);
                }
                else if (h%2 != 0) {
                    odd.addNumber(h);
                }
            }
        }
        
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());

    }
}
