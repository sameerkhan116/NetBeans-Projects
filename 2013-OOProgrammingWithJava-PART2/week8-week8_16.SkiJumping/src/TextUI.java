
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sameerkhan
 */
public class TextUI {
    private Scanner in;
    private Participants participants;
    
    public TextUI() {
        this.in = new Scanner(System.in);
        this.participants = new Participants();
    }
    
    public void launch() {
        this.getParticipants();
        this.round();
        this.results();
    }
    
    public void getParticipants(){
        System.out.println("Kumpula ski jumping week");
        System.out.println();
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        
        while(true) {
            System.out.println("  Participant name: ");
            String h = this.in.nextLine();
            if(h.isEmpty()) {
                break;
            }
            Jumper jump = new Jumper(h);
            this.participants.add(jump);
        }
        System.out.println();
        System.out.println("The tournament begins!");
        System.out.println();
    }
    
    public void round() {
        int roundNumber = 1;
        while(true){
            System.out.println("Write \"jump\" to jump; otherwise you quit: ");
            String input = this.in.nextLine();
            if(input.equals("quit")){
                break;
            } else if(input.equals("jump")) {
                System.out.println("");
                System.out.println("Round " + roundNumber);
                System.out.println("");
                this.participants.sort();
                this.participants.reverse();
                System.out.println("Jumping order:");
                this.participants.printInOrder();
                System.out.println("");
                System.out.println("Results of round " + roundNumber);
                this.participants.play();
                System.out.println("");
                roundNumber++;
            }
        }
        System.out.println("");
        System.out.println("Thanks!");
        System.out.println("");
    }
    
    public void results() {
        this.participants.sort();
        System.out.println("Tournament results: ");
        this.participants.printResults();
    }
}
