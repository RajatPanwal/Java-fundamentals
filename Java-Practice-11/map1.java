import java.util.HashMap;
import java.util.Map;

public class map1 {
    
    public static void main(String[] args) {
        
        Map<String, Integer> mp = new HashMap<>();

        mp.put("R", 10);
        mp.put("A", 20);
        mp.put("J", 30);
        mp.put("A", 40);
        mp.put("T", 50);

        System.out.println(mp);

    }

}
