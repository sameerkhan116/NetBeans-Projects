/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sameerkhan
 */
public class BoundedCounter {
    private int up, value;
    
    public BoundedCounter(int upperBound) {
        this.value = 0;
        this.up = upperBound; 
    }
    
    public void next() {
        this.value++;
        if(this.value > this.up) {
            this.value = 0;
        }
    }
    
    public int getValue() {
        return this.value;
    }   
    
    public void setValue(int input) {
        if(input > 0 && input <= this.up) {
            this.value = input;
        }
    }
    
    public String toString() {
        return "" + String.format("%02d", this.value);
    }
}
