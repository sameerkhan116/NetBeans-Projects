
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sameerkhan
 */
public class Dictionary {
    private HashMap<String, String> hash;
    
    public Dictionary() {
        this.hash = new HashMap<String, String>();
    }
    
    public String translate(String word) {
        if(this.hash.containsKey(word)) {
            return this.hash.get(word);
        }
        return null;
    }
    
    public void add(String word, String translation) {
        this.hash.put(word, translation);
    }
    
    public int amountOfWords() {
        return this.hash.size();
    }
    
    public ArrayList<String> translationList() {
        ArrayList<String> arr = new ArrayList<String>();
        for(String key : this.hash.keySet()) {
            arr.add(key + " = " + this.hash.get(key));
        }
        return arr;
    }
}
