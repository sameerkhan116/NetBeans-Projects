
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

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
        Collections.sort(words);
        for (String word:words) {
            System.out.println(word);
        }
    }
}