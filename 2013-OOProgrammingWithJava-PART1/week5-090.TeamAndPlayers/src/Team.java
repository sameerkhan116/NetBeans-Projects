
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
public class Team {
    private String name;
    private ArrayList<Player> player;
    private int maxSize = 16;
    
    public Team(String name) {
        this.name = name;
        this.player = new ArrayList<Player>();
    }
    
    public String getName() {
        return this.name;
    }
    
    public void addPlayer(Player name) {
        if(this.player.size() < maxSize) {
        this.player.add(name);
        }
    }
    
    public void printPlayers() {
        for(Player play : this.player) {
           System.out.println(play.getName() + ", goals " + play.goals()); 
        }
    }
    
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public int size() {
        return this.player.size();
    }
    
    public int goals() {
        int goals = 0;
        for(Player play : this.player) {
            goals += play.goals();
        }
        return goals;
    }
    
}

