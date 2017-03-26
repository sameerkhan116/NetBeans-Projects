import java.util.Random;

public class PasswordRandomizer {
    private int length;
    Random random;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        String symbol = "";
        int i = 0;
        while(i < this.length) {
            int num = this.random.nextInt(26);
            symbol += "abcdefghijklmnopqrstuvwxyz".charAt(num);
            i++;
        }
        return symbol;
    }
}
