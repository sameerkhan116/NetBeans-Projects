
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
    private ArrayList<String> flight;
    
    public Flight() {
        this.flight = new ArrayList<String>();
    }
    
    public void addFlight(String entry) {
        this.flight.add(entry);
    }
    
    @Override
    public String toString() {
        String buffer = "";
        
        for(String i : this.flight) {
            buffer += i + "\n";
        }
        return buffer;
    }
}
