import java.util.Scanner;
import java.util.ArrayList;

public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner reader = new Scanner(System.in);
        ArrayList<Bird> bird = new ArrayList<Bird>();
        
        while(true) {
            System.out.print("? ");
            String in = reader.nextLine();
            
            if(in.equals("Add")) {
                System.out.print("Name: ");
                String name = reader.nextLine();
                System.out.print("Latin Name: ");
                String lname = reader.nextLine();
                Bird newbird = new Bird(name, lname);
                bird.add(newbird);
            }
            
            if(in.equals("Observation")) {
                System.out.print("What was observed:? ");
                String obs = reader.nextLine();
                for(Bird best : bird) {
                    if(best.getName().equals(obs)) {
                        best.Observed();
                    } else {
                        System.out.println("Is not a bird!");
                    }
                }
            }
            
            if(in.equals("Statistics")) {
                for (Bird i : bird) {
                    System.out.println(i);
                }
            }
            
            if(in.equals("Show")) {
                System.out.print("What? ");
                String show = reader.nextLine();
                for(Bird i : bird) {
                    if(i.getName().equals(show)) {
                        System.out.println(i);
                    }
                }
            }
            
            if(in.equals("Quit")) {
                break;
            }
            
        }       
    }
}
