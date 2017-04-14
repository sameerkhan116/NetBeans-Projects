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
public class Flight {
    private ArrayList<String> newFlight;
    
    public Flight() {
        this.newFlight = new ArrayList<String>();
    }
    
    public void addFlight(String a, String b) {
        this.newFlight.add("(" + a + "-" + b + ")");
    }
    
}
