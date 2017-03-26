import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    Random random;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.random = new Random();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        while(this.numbers.size() < 7) {
            int h = (1 + this.random.nextInt(39));
            if(!containsNumber(h)) {
                this.numbers.add(h);
            }
        }
        // Write the number drawing here using the method containsNumber()
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        
        return this.numbers.contains(number);
    }
}
