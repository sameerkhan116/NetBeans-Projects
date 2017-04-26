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
public class Container {
    private int limit;
    private ArrayList<Suitcase> newsuit;
    
    public Container(int limit) {
        this.limit = limit;
        this.newsuit = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if(this.limit - suitcase.totalWeight() >= 0) {
            this.limit -= suitcase.totalWeight();
            newsuit.add(suitcase);
        }
    }
    
    public int totalWeight() {
        int result = 0;
        for(Suitcase item : newsuit) {
            result += item.totalWeight();
        }
        return result;
    }
    
    public void printThings() {
        for(Suitcase item : newsuit) {
            item.printThings();
        }
    }
    
    public String toString() {
        return newsuit.size() + " suitcases (" + totalWeight() + " kg)";
    }
    
    
}