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
public class Suitcase {
    private ArrayList<Thing> things;
    private int limWeight;
    
    public Suitcase(int limWeight) {
        this.things = new ArrayList<Thing>();
        this.limWeight = limWeight;
    }
    
    public void addThing(Thing thing) {
        if(this.limWeight - thing.getWeight() >= 0) {
            limWeight -= thing.getWeight();
            this.things.add(thing);
        }
    }
    
    public int totalWeight() {
        int weight = 0;
        for(Thing item : this.things) {
            weight += item.getWeight();
        }
        return weight;
    }
    
    public void printThings() {
        for(Thing item : this.things) {
            System.out.println(item);
        }
    }
    
    public Thing heaviestThing() {
        int max = 0;
        for(Thing item : this.things) {
            if(item.getWeight() >= max) {
                max = item.getWeight();
            }
        }
        
        for(Thing item: this.things) {
            if(item.getWeight() == max) {
                return item;
            }
        }
        return null;
    }
    
    @Override
    public String toString() {
        int weight = 0;
        for(Thing item : this.things) {
            weight += item.getWeight();
        }
        if(this.things.size() == 0) { 
            return "empty (0 kg)";
        } else if(this.things.size() == 1) {
            return "1 thing (" + totalWeight() + " kg)";
        } else {
            return this.things.size() + " things (" + totalWeight() + " kg)";
        }
    }
    
    

}
