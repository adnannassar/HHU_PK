package Map;

import java.util.*;

public class MapTest2 {
    public static void main(String[] args) {
        Map<String, Float> map = new HashMap<String, Float>();
        map.put("Mathe", 1.3f);
        map.put("PK1", 1.0f);
        map.put("Statistik", 2.0f);
        map.put("PK2", 1.7f);
        map.put("PK2", 2.0f);

        System.out.println("Map: " + map);

        Set<String> keys = map.keySet();
        Collection<Float> values = map.values();

        System.out.println("Keys: " + keys);
        System.out.println("Values: " + values);


        for (String key : keys) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
