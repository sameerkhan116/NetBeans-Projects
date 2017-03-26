import java.util.Random;

public class Dice {
    private Random random;
    private int numberOfSides = 1;

    public Dice(int numberOfSides) {
        // Initialize here the number of sides
        this.numberOfSides = numberOfSides;
        random = new Random();
    }

    public int roll() {
        int prob = this.random.nextInt(this.numberOfSides) + 1;
        return prob;
    }
}
