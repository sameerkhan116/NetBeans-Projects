
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
public class Box implements ToBeStored {
    private ArrayList<ToBeStored> list;
    private double weight;
    private double maxWeight;
    
    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.list = new ArrayList<ToBeStored>();
    }
    
    public void add(ToBeStored e) {
        if(this.weight + e.weight() < this.maxWeight) {
            this.weight += e.weight();
            list.add(e);
        } else {
            System.out.println(e + " can't be added to this box.");
        }
    }
    
    public void add(CD cd) {
        if(this.weight + cd.weight() < this.maxWeight) {
            this.weight += cd.weight();
            list.add(cd);
        } else {
            System.out.println(cd + " can't be added to this box.");
        }
    }
    
    public void add(Book book) {
        if(this.weight + book.weight() < this.maxWeight) {
            this.weight += book.weight();
            list.add(book);
        } else {
            System.out.println(book + " can't be added to this box.");
        }
    }
    
    public void add(Box box) {
        if(this.weight + box.weight < this.maxWeight) {
            this.weight += box.weight();
            list.add(box);
        } else {
            System.out.println(box + " can't be added to this box.");
        }
    }
    
    @Override
    public String toString() {
        return "Box: " + list.size() + " things, total weight " + this.weight + " kg";
    }

    @Override
    public double weight() {
        double weight = 0;
        
        for(ToBeStored e : list) {
            weight += e.weight();
        }
        return weight;
    }
    
}
