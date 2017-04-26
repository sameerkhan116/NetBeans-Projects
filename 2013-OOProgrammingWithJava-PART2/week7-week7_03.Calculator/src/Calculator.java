/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sameerkhan
 */
public class Calculator {
    private Reader reader;
    private int calculations;
    
    public Calculator() {
        this.reader = new Reader();
    }
    
    public void start() {
        while(true) {
            System.out.print("command: ");
            String command = this.reader.readString();
            if(command.equals("end")) {
                break;
            }
            
            if(command.equals("sum")) {
                sum();
            } else if(command.equals("difference")) {
                difference();
            } else if(command.equals("product")) {
                product();
            } 
        }
        statistics();
    }
    
    private void sum() {
        int[] arr = askInput();
        int result = arr[0] + arr[1];
        System.out.println("sum of the values " + result);
        this.calculations++;
    }
    
    private void product() {
        int[] arr = askInput();
        int result = arr[0] * arr[1];
        System.out.println("product of the values " + result);
        this.calculations++;
    }
    
    private void difference() {
        int[] arr = askInput();
        int result = arr[0] - arr[1];
        System.out.println("difference of the values " + result);
        this.calculations++;
    }
    
    private void statistics() {
        System.out.println("Calculations done " + this.calculations);
    }
    
    public int[] askInput() {
        int[] input = new int[2];
        System.out.print("value1: ");
        input[0] = this.reader.readInteger();
        System.out.print("value2: ");
        input[1] = this.reader.readInteger();
        
        return input;
        
    }
}