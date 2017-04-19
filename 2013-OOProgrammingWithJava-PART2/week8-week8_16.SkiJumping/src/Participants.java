
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sameerkhan
 */
public class Participants {
    private List<Jumper> participants;
    private Random random;
    
    public Participants() {
        this.participants = new ArrayList<Jumper>();
        this.random = new Random();
    }
    
    public void add(Jumper j) {
        this.participants.add(j);
    }
    
    public void play() {
        for(Jumper j : this.participants) {
            int jumpLength = random.nextInt(120 - 60 + 1) + 60;
            j.addJump(jumpLength);
            List<Integer> scores = new ArrayList<Integer>();
            for(int i = 0; i < 5; i++) {
                scores.add(random.nextInt(20-10 + 1) + 10);
            }
            System.out.println("  " + j.getName());
            System.out.println("    length: " + jumpLength);
            System.out.println("    judge votes: " + scores);
            
            Collections.sort(scores);
            
            scores.remove(0);
            scores.remove(scores.size() - 1);
            
            int sumOfScores = 0;
            for(int i : scores) {
                sumOfScores += i;
            }
            
            int points = jumpLength + sumOfScores;
            j.addPoints(points);
        }
    }
    
    public void print() {
        for(Jumper j : this.participants) {
            System.out.println(j);
        }
    }
    
    public void printInOrder() {
        for(int i = 0; i < this.participants.size(); i++) {
            int counter = i + 1;
            System.out.println("  " + counter + ". " + this.participants.get(i));
        }
    }
    
    public void printResults() {
        System.out.println("Position    Name");
        int counter = 1;
        for(Jumper j : this.participants) {
            System.out.println(counter + "           " + j);
            j.printJumpLengths();
            counter++;
            System.out.println("");
        }
    }
    
    public void sort() {
        Collections.sort(this.participants);
    }
    
    public void reverse() {
        Collections.reverse(this.participants);
    }
    
}
