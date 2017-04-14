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
    
    public void addPlane(String Id, int capacity) {
        this.plane.put(Id, capacity);
    }
    
    public void printPlane() {
        for(String key : this.plane.keySet()) {
            System.out.println(key + " (" + this.plane.get(key)+ "ppl)");
        }
    }
}
