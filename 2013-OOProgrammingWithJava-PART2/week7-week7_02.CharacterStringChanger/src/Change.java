/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sameerkhan
 */
public class Change {
        private String string;
        private char a;
        private char x;
        
    public Change(char fromCharacter, char toCharacter) {
        this.a = fromCharacter;
        this.x = toCharacter;
    }
    
    public String change(String characterString) {
        this.string = characterString;
        String newStr = this.string.replace(this.a, this.x);
        return newStr;
    }
}