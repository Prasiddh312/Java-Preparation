import java.util.*;

public class HashMapSorting {
    public static void main(String[] args) {
        HashMap<Integer,String> fruits=new HashMap<>();
        fruits.put(1,"Orange");
        fruits.put(3,"Apple");
        fruits.put(2,"Pineapple");
        fruits.put(4,"Banana");

        System.out.println("Before Sorting:");
        Set set=fruits.entrySet();
        Iterator iterator=set.iterator();

        while(iterator.hasNext()){
            Map.Entry pair=(Map.Entry)iterator.next();
            System.out.println(pair.getKey()+":");
            System.out.println(pair.getValue());
        }
            //Sorting By Key
        TreeMap<Integer,String>sorted=new TreeMap<>();

        sorted.putAll(fruits);
        System.out.println(sorted);

    }
}
