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
public class Airplane {
    private HashMap<String, Integer> plane;
    
    public Airplane() {
        this.plane = new HashMap<String, Integer>();
    }
    
    public void add(String a, int b) {
        this.plane.put(a, b);
    }
    
    public String getString(String key) {
        return key + " (" + this.plane.get(key) + " ppl)";
    }
    
    @Override
    public String toString() {
        String buffer = "";
        
        for(String i : this.plane.keySet()) {
            buffer += i + " (" + this.plane.get(i) + " ppl)\n";
        }
        return buffer;
    }
}