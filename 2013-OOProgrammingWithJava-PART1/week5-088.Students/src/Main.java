
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> arrays = new ArrayList<Student>();
        while(true) {
            System.out.println("name: "); 
            String name = reader.nextLine();
            if(name.equals("")) {
                break;
            } else {
                System.out.println("studentnumber: ");
                String studentNumber = reader.nextLine();
                Student pekka = new Student(name, studentNumber);
                arrays.add(pekka);
            }
        }
        
        
        for(Student pers : arrays) {
             System.out.println(pers);
        }
        
        System.out.println("Given search term: ");
        String search = reader.nextLine();
        System.out.println("Result:");
        for(Student pers : arrays) {
            if(pers.getName().contains(search)) {
                System.out.println(pers.toString());
            }
        }
       
       
    }
}