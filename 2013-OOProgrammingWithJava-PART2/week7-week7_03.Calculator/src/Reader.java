
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
public class Reader {
    private Scanner in;
    
    public Reader() {
        this.in = new Scanner(System.in);
    }
    
    public String readString() {
        String input = this.in.nextLine();
        return input;
    }
    
    public int readInteger() {
        int input = Integer.parseInt(this.in.nextLine());
        return input;
    }
    
}
