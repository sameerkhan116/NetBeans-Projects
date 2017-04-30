/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sameerkhan
 */
public class WordInspection {
    private File file;
    private List<String> zWord;
    private List<String> lWord;
    private List<String> palindromelist;
    private List<String> allVowels;
    private Scanner reader;
    
    public WordInspection(File file) throws Exception {
        this.file = file;
        this.zWord = new ArrayList<String>();
        this.lWord = new ArrayList<String>();
        this.palindromelist = new ArrayList<String>();
        this.allVowels = new ArrayList<String>();
        this.reader = new Scanner(file, "UTF-8");
    }
    
    public int wordCount() {
        String buffer = "";
        int count = 0;
        
        while(this.reader.hasNextLine()) {
            buffer = this.reader.nextLine();
            count++;
        }
        
        this.reader.close();
        return count;
    }
    
    public List<String> wordsContainingZ() {
        String buffer = "";
        
        while(this.reader.hasNextLine()) {
            buffer = this.reader.nextLine();
            if(buffer.contains("z")) {
                this.zWord.add(buffer);
            }
        }
        
        this.reader.close();
        return this.zWord;
    }
    
    public List<String> wordsEndingInL() {
        String buffer = "";
        
        while(this.reader.hasNextLine()) {
            buffer = this.reader.nextLine();
            if(buffer.charAt(buffer.length() - 1) == 'l') {
                this.lWord.add(buffer);
            }
        }
        
        this.reader.close();
        return this.lWord;
    }
    
    public List<String> palindromes() {
        String buffer = "";
        String reverseBuffer = "";
        
        while(this.reader.hasNextLine()) {
            buffer = this.reader.nextLine();
            int n = buffer.length();
            
            for(int i = n - 1; i >= 0; i--) {
                reverseBuffer += buffer.charAt(i);
            }
            
            if(buffer.equals(reverseBuffer)) {
                this.palindromelist.add(buffer);
            }
            reverseBuffer = "";
        }
        
        this.reader.close();
        return this.palindromelist;
    }
    
    public List<String> wordsWhichContainAllVowels() {
        String buffer = "";
        
        while(this.reader.hasNextLine()) {
            buffer = this.reader.nextLine();
            if(buffer.contains("a") && buffer.contains("e") && buffer.contains("i") && buffer.contains("o") && buffer.contains("u") && buffer.contains("y") && buffer.contains("ä") && buffer.contains("ö")) {
                this.allVowels.add(buffer);
            }
        }
        
        this.reader.close();
        return this.allVowels;
    }
    
}
