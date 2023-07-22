import java.util.*;
public class HashMapExample {

    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Prasidh");
        map.put(2,"Singh");
        map.put(3,"Java");
        map.put(4,"Fullstack");
        System.out.println(map.size());
        System.out.println(map);


        //map.clear();
        if(map.isEmpty()){
            System.out.println("Hashmap is Empty");
        }
        else {
            System.out.println("Hashmap is Not Empty");
        }
        //To Iterate on Hashmap

        //1-Using For Each Loop
        for (Integer key: map.keySet()
             ) {
            System.out.println("Key:"+key+" Value:"+map.get(key));
            
        }

        //2-Using Keyset iterator"

        Iterator<Integer>keySetIterator=map.keySet().iterator();
        while (keySetIterator.hasNext()){
            Integer key=keySetIterator.next();
            System.out.println(key+map.get(key));
        }




    }
}
