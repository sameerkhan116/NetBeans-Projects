/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sameerkhan
 */
public class Person {
    private String getName;
    private String getNumber;
    
    public Person(String getName, String getNumber) {
        this.getName = getName;
        this.getNumber = getNumber;
    }
    
    public String getName() {
        return this.getName;
    }
    
    public String getNumber() {
        return this.getNumber;
    }
    
    public void changeNumber(String newNumber) {
        this.getNumber = newNumber;
    }
    
    @Override
    public String toString() {
        return this.getName + " number: " + this.getNumber;
    }
}