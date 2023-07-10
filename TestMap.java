import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {

        /************HashMap*************/
        //Does not maintain any order

        Map<String ,Integer> map= new HashMap<>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);
        map.put("Four",4);
        map.put("Five",5);

        System.out.println(map);
        map.put("Five",5);//Doesn't contain duplicate Keys.
        System.out.println(map);
        map.put("Six",5);//Can Contain Duplicate values
        System.out.println(map);

        //Remove Elements
        map.remove("Two");
        System.out.println(map);

        //Set view of a map
        map.entrySet();
        //System.out.println();
        map.keySet();
        //System.out.println(map);

            //Iterate On Map

        for (Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey()+" "+e.getValue());
        }
        System.out.println("LinkedHashMap Started");

        /********************LinkedHashMap*****************/

        //Maintains Insertion Order
        Map<String,Integer> linkedHashMap= new LinkedHashMap<>();
        linkedHashMap.put("One",1);
        linkedHashMap.put("Three",3);
        linkedHashMap.put("Two",2);
        linkedHashMap.put("Five",5);

        System.out.println(linkedHashMap);

    }
}
