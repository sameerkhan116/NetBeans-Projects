
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sameerkhan
 */
public class Changer {
    private int changes;
    private ArrayList<Change> change;
    
    public Changer() {
        this.change = new ArrayList<Change>();  
    }
    
    public void addChange(Change change) {
        this.change.add(change);
    }
    
    public String change(String characterString) {
        String newStr = "";
        for(Change item : this.change) {
            characterString = item.change(characterString);
        }
        return characterString;
         
    }
}
