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
public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;
    
    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }
    
    public NightSky(int width, int height) {
        this.width = width;
        this.height = height;
        this.density = 0.1;
    }
    
    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
    }
    
    public void printLine() {
        for(int i = 0; i < this.width; i++) {
            double r = new Random().nextDouble();
            if(r > this.density) {
            System.out.print(" ");
            } else {
                System.out.print("*");
                starsInLastPrint += 1;
            }
        }
    }
    
    public void print() {
        for(int i = 0; i < this.height; i++) {
            printLine();
            System.out.println();
        }
    }
    
    public int starsInLastPrint() {
        int temp = starsInLastPrint;
        starsInLastPrint = 0;
        return temp;
    }
}