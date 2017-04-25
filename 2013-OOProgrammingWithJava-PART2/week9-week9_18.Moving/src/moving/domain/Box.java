/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sameerkhan
 */
public class Box implements Thing {
    private int maximumCapacity;
    private List<Thing> newbox;
    
    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.newbox = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing) {
        if(this.maximumCapacity - this.getVolume() >= thing.getVolume()) {
            this.newbox.add(thing);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int getVolume() {
        int total = 0;
        
        for(Thing e : this.newbox) {
            total += e.getVolume();
        }
        
        return total;
    }
    
    public String toString(){
         return this.getVolume() + " size" + this.newbox.size();
     }
}
