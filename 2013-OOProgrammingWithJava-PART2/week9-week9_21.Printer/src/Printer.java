
import java.io.File;
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
public class Printer {
    private String filename;
    
    public Printer(String filename) throws Exception {
        this.filename = filename;
    }
    
    public void printLinesWhichContain(String word) throws Exception {
        File f = new File(this.filename);
        Scanner reader = new Scanner(f);
        
        String buffer = "";
        String line = "";
        
        while(reader.hasNextLine()) {
            line = reader.nextLine();
            
            if(line.contains(word)) {
                buffer += line;
                buffer += "\n";
                
                System.out.println(line);
            }
        }
        
    }
    
}
