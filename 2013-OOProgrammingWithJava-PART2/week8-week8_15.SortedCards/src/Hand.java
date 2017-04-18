
import java.util.ArrayList;
import java.util.Collections;
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
public class Hand implements Comparable<Hand> {
    private List<Card> hand;
    
    public Hand() {
        this.hand = new ArrayList<Card>();
    }
    
    public void add(Card card) {
        this.hand.add(card);
    }
    
    public void print() {
        for(Card e : this.hand) {
            System.out.println(e);
        }
    }
    
    private int sum() {
        int sum = 0;
        for(Card c : this.hand) {
            sum += c.getValue();
        }
        return sum;
    }
    
    public void sort() {
        Collections.sort(this.hand);
    }
    
    public void sortAgainstSuit() {
        Collections.sort(this.hand, new SortAgainstSuitAndValue());
    }
    
    @Override
    public int compareTo(Hand h) {
        if(sum() == h.sum()) {
            return 0;
        } else if(sum() > h.sum()) {
            return 1;
        }
        return -1;
    }
}
