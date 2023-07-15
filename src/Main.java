import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("employee1", 10000);
        map.put("employee2", 20000);
        map.put("employee3", 30000);
        map.put("employee4", 35000);
        map.put("employee5", 40000);
        map.put(null, 45000);
        map.put("employee6", null);

        for (Map.Entry<String, Integer> val:map.entrySet()) {
            System.out.println(val.getKey() + " " +val.getValue());
        }

        map.forEach( (k, v) -> System.out.println(k + " "+ v));

        map.forEach( (k, v) -> {
            if(null != k && v != null) {
                System.out.println(k + " " + v);
            }
        });
    }
}