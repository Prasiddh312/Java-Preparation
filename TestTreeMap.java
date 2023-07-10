import java.util.Map;
import java.util.TreeMap;

//Maintains Ascending Order.
public class TestTreeMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> map=new TreeMap<>();

        map.put("eleven",11);
        map.put("one",1);
        map.put("three",3);
        map.put("two",2);
        map.put("four",4);

        System.out.println(map);

        map.remove("two");
        System.out.println(map);

        map.putIfAbsent("two",67);
        System.out.println(map);

        // iterate on map

        for (Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}
