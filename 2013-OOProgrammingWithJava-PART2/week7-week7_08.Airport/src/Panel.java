import java.util.HashMap;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sameerkhan
 */
public class Panel {
    private Flight flight;
    private Airplane airplane;
    private HashMap<Airplane, Flight> mainOne;
    
    public Panel() {
        this.mainOne = new HashMap<Airplane, Flight>();
        this.flight = new Flight();
        this.airplane = new Airplane();
    }
    
    public void start() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        Scanner in = new Scanner(System.in);
        
        while(true) {
            
            if(Integer.parseInt(in.nextLine()) == 1) {
                System.out.print("Give plane ID: ");
                String h = in.nextLine();
                System.out.print("Give plane capacity: ");
                int n = Integer.parseInt(in.nextLine());
                this.airplane.addPlane(h, n);
            }
            
            if(Integer.parseInt(in.nextLine()) == 2) {
                System.out.print("Give plane ID: ");
                String x = in.nextLine();
                System.out.println("Give departure airport code: ");
                String a = in.nextLine();
                System.out.println("Give destination airport code: ");
                String b = in.nextLine();
                this.flight.addFlight(a, b);
            }
            
        }
    }
}
