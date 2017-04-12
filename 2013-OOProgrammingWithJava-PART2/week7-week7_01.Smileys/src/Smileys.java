
public class Smileys {

    public static void main(String[] args) {
        printWithSmileys("Mikale");
    }
    
    private static void printWithSmileys(String characterString) {
        if(characterString.length() >= 6) {
            for(int i = 0; i < characterString.length(); i++) {
                System.out.print(":)");
            }
            System.out.println("");
            if(characterString.length() % 2 == 0) {
                System.out.println(":) " + characterString + " :)");
            } else {
                System.out.println(":) " + characterString + "  :)");
            }
            
            for(int i = 0; i < characterString.length(); i++) {
                System.out.print(":)");
            }
        } else {
            for(int i = 0; i <= characterString.length(); i++) {
                System.out.print(":)");
            }
            System.out.println("");
            
            if(characterString.length() % 2 == 0) {
                System.out.println(":) " + characterString + " :)");
            } else {
                System.out.println(":) " + characterString + "  :)");
            }
            
            for(int i = 0; i <= characterString.length(); i++) {
                System.out.print(":)");
            }
        }
        
    }
}
