import java.util.ArrayList;
import java.util.Iterator;

//In an Array, array length is fixed Array list allocates memory dynamically
//By default ArrayList creates an array of size 10.

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        //Add Elements in ArrayList
        list.add(10);
        list.add(20);
        list.add(45);
        list.add(67);
        System.out.println(list);

        list.add(2,78);//This will add element at given index in ArrayList
        System.out.println(list);

        ArrayList<Integer> newlist= new ArrayList<>();
        newlist.add(19);
        newlist.add(03);
        list.addAll(newlist);//This will add all element of list (newlist) in another list
        System.out.println(list);

        // Fetch the element from list
        System.out.println(list.get(4));

        // remove the element from list
        list.remove(4);//This Will remove elements from given index
        list.remove(Integer.valueOf(45));//This will remove given element from list
        System.out.println(list);

        // If we want to update the element then we use set
        list.set(2, 1000);
        System.out.println(list);

        System.out.println(list.contains(567)); // It will check whether the element is in list or not it will return boolean value.
        System.out.println(list.contains(1000));

        //To Iterate On List
        //Way1.

        for ( Integer element:list
             ) {
            System.out.println(element);
        }

        //Way2

        Iterator<Integer> iterator= list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()+10);
        }

        //list.clear();  // This will remove all element from list
        //System.out.println(list);

        /*ArrayList<String> names=new ArrayList<>();
        names.add("Prasiddh");
        names.add("Kajal");
        names.add("Richa");
        names.add("Rajul");
        System.out.println(names);*/

    }
}