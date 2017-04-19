
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sameerkhan
 */
public class Jumper implements Comparable<Jumper> {
    private String name;
    private int totalPoints;
    private List<Integer> jumps;
    
    public Jumper(String name) {
        this.name = name;
        this.totalPoints = 0;
        this.jumps = new ArrayList<Integer>();
    }
    
    public String getName() {
        return this.name;
    }
    
    public void addPoints(int points) {
        this.totalPoints += points;
    }
    
    public void addJump(int jump) {
        this.jumps.add(jump);
    }
    
    @Override
    public int compareTo(Jumper o) {
        return o.totalPoints - this.totalPoints;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.totalPoints + " points)";
    }
    
    public void printJumpLengths() {
        String formatted = this.jumps.toString().replace("[","").replace(","," m,").replace("]"," m");
        System.out.print("            jump lengths: " + formatted);
    }
}