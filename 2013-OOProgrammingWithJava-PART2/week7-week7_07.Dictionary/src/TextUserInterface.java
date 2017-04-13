
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
public class TextUserInterface {
    private Scanner in;
    private Dictionary dict;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.in = reader;
        this.dict = dictionary;
    }
    
    public void add(String a, String b) {
        this.dict.add(a, b);
    }
    
    public void translate(String a) {
        System.out.println("Translation: " + this.dict.translate(a));
    }
    
    public void start() {
        System.out.println("Statements:");
        System.out.println("\tadd - adds a word pair to the dictionary");
        System.out.println("\ttranslate - asks a word and prints its translation");
        System.out.println("\tquit - quit the text user interface");
        
        while(true) {
            System.out.println("");
            System.out.print("Statement: ");
            String input = this.in.nextLine();
            
            if(input.equals("add")) {
                System.out.print("In Finnish: ");
                String a = this.in.nextLine();
                System.out.print("Translation: ");
                String b = this.in.nextLine();
                add(a, b);
            }
            
            if(input.equals("translate")) {
                System.out.print("Give a word: ");
                String a = this.in.nextLine();
                translate(a);
            }
            
            if(input.equals("quit")) {
                System.out.println("Cheers!");
                break;
            }
            
            else if(!(input.equals("quit") || input.equals("add") || input.equals("translate"))) {
                System.out.println("Unknown statement");
            }
        }
    }
}
