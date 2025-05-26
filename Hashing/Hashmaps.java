import java.util.*;
public class Hashmaps {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("India",100);
        map.put("China",150);
        map.put("USA",50);
        System.out.println(map);
        System.out.println(map.get("India"));
        System.out.println(map.get("Nepal"));
        System.out.println(map.containsKey("China"));
        System.out.println(map.containsKey("Nepal"));
        System.out.println(map.remove("India"));
        System.out.println(map);
        System.out.println(map.size());
        map.clear();
        System.out.println(map);
        map.put("India",100);
        map.put("China",150);
        map.put("USA",50);
        //Iterate through map
        Set<String> keys=map.keySet();
        for(String k:keys){
            System.out.println("key="+k+" value="+map.get(k));
        }
    }
}
