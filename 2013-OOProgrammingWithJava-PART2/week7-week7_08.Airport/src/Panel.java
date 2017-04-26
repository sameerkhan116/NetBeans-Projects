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
    private Scanner in;
    private Airplane plane;
    private Flight flight;
    
    public Panel(Scanner reader, Airplane plane, Flight flight) {
        this.in = reader;
        this.plane = plane;
        this.flight = flight;
    }
    
    public void start() {
        boolean end = false;
        
        System.out.println("Airport panel\n--------------------\n");
        
        while(true) {
            
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
        
            System.out.print("> ");
            String h = this.in.nextLine();
            
            if(h.equals("1")) {
                System.out.print("Give plane ID: ");
                String a = this.in.nextLine();
                System.out.print("Give plane capacity: ");
                int b = Integer.parseInt(this.in.nextLine());
                this.plane.add(a, b);
            }
            
            if(h.equals("2")) {
                System.out.print("Give plane ID: ");
                String x = this.in.nextLine();
                
                String planeIdBuff = this.plane.getString(x);
                
                System.out.print("Give departure airport code: ");
                String a = this.in.nextLine();
                System.out.print("Give destination airport code: ");
                String b = this.in.nextLine();
                
                String conn = planeIdBuff + " (" + a + "-" + b +")";
                
                this.flight.addFlight(conn);
            }
            
            if(h.equals("x")) {
                
                System.out.println("\nFlight service\n------------\n");
                
                
                while(true) {
                    
                    System.out.println("Choose operation:");
                    System.out.println("[1] Print planes");
                    System.out.println("[2] Print flights");
                    System.out.println("[3] Print plane info");
                    System.out.println("[x] Quit");
                    
                    System.out.print("> ");
                    String u = this.in.nextLine();
                    
                    if(u.equals("1")) {
                        System.out.println(this.plane);
                    }
                    
                    if(u.equals("2")) {
                        System.out.println(this.flight);
                    }
                    
                    if(u.equals("3")) {
                        System.out.print("Give plane ID: ");
                        String a = this.in.nextLine();
                        
                        System.out.println(this.plane.getString(a) + "\n");
                    }
                    
                    if(u.equals("x")) {
                        end = true;
                        break;
                    }
                }
            }
            if(end)
                break;
        }
    }
}