
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
public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owner;
    
    public VehicleRegister() {
        this.owner = new HashMap<RegistrationPlate, String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner) {
        if(!this.owner.containsKey(plate)) {
            this.owner.put(plate, owner);
            return true;
        }
        return false;
    }
    
    public String get(RegistrationPlate plate) {
        return this.owner.get(plate);
    }
    
    public boolean delete(RegistrationPlate plate) {
        if(this.owner.containsKey(plate)) {
            this.owner.remove(plate);
            return true;
        }
        return false;
    }
    
    public void printRegistrationPlates() {
        for(RegistrationPlate reg : this.owner.keySet()) {
            System.out.println(reg);
        }
    }
    
    public void printOwners() {
        ArrayList<String> buffer = new ArrayList<String>();
        String toAdd = "";
        
        for(RegistrationPlate i : this.owner.keySet()) {
            toAdd = this.owner.get(i);
            if(!buffer.contains(toAdd)) {
                buffer.add(toAdd);
            }
        }
        
        for(String j : buffer) {
            System.out.println(j);
        }
    }
}
