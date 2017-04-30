
import java.io.File;


public class Main {

    public static void main(String[] args) throws Exception {
        File file = new File("src/kalevala.txt");
        Analysis count = new Analysis(file);
        System.out.println(count.lines());
    }
}
