/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sameerkhan
 */
public class Bird {
    private String name;
    private String lname;
    private int observations;
    
    public Bird(String name, String lname) {
        this.name = name;
        this.lname = lname;
        this.observations = 0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void Observed() {
        this.observations++;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.lname + "): " + this.observations + " observations";
    }
}
