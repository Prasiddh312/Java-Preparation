import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//link -> https://www.geeksforgeeks.org/set-in-java/
public class TestSet {

    /*************HashSet***************/

    //Stores Value Randomly
    public static void main(String[] args) {
        Set<Integer> set= new HashSet<>();

        set.add(40);
        set.add(50);
        set.add(30);
        set.add(100);
        set.add(90);
        System.out.println(set);

        // to remove elements from set
        set.remove(50);
        System.out.println(set);

        System.out.println(set.contains(1000));//Will Return Boolean Value
        System.out.println(set.isEmpty());

        /***********LinkedHashSet***************/

        //Stores Value in the order that elements entered
        Set<Integer> linkedhashset=new LinkedHashSet<>();
        linkedhashset.add(2);
        linkedhashset.add(5);
        linkedhashset.add(7);
        linkedhashset.add(3);
        linkedhashset.add(6);

        System.out.println(linkedhashset);

        linkedhashset.remove(5);
        System.out.println(linkedhashset);

        /**************** TreeSet ****************/
        // sorted form
        Set<Integer> treeset=new TreeSet<>();

        treeset.add(21);
        treeset.add(34);
        treeset.add(11);
        treeset.add(18);
        treeset.add(89);

        System.out.println(treeset);

        treeset.remove(34);
        System.out.println(treeset);

    }
}
