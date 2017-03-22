
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Type the radius: ");
        double radius = in.nextInt();
        
        double circum = 2 * Math.PI * radius;
        
        System.out.println("Circumference of the circle: " + circum);
        // Program your solution here 
    }
}
