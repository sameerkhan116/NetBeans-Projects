
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // Write your code here.
        double temp;
        while (true) {
            System.out.println("Enter temperature: ");
            temp = Double.parseDouble(in.nextLine());
            if (temp >= -30 && temp <= 40) {
                Graph.addNumber(temp);
            } else {
                System.out.println("Enter value between -30 and +40 degrees.");
            }      
        }
        // Graph is used as follows:
//        Graph.addNumber(7);
//        double value = 13.5;
//        Graph.addNumber(value);
//        value = 3;
//        Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }
}