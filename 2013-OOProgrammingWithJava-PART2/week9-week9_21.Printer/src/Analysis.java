
import java.io.File;
import java.io.FileNotFoundException;
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
public class Analysis {
    private File file;
    
    public Analysis(File file) {
        this.file = file;
    }
    
    public int lines() throws FileNotFoundException {
        Scanner reader = new Scanner(this.file);
        String buffer = "";
        int i = 0;
        while(reader.hasNextLine()) {
            buffer = reader.nextLine();
            i++;
        }
        reader.close();
        return i;
    }
}
