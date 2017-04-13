
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String, String> name= new HashMap<String, String>();
        name.put("matti", "mage");
        name.put("mikael", "mixu");
        name.put("arto", "arppa");
        
        String nname = name.get("mikael");
        System.out.println(nname);
    }

}
