import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("Type a word: ");
            String text = reader.nextLine();
            words.add(text);
            if (text.isEmpty()) {
                break;
            }
        }
        System.out.println("You typed the following words: ");
        Collections.reverse(words);
        for (String word:words) {
            System.out.println(word);
        }
        // create here an ArrayList
        
    }
}
