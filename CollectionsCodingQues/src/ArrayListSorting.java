import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList<String>al=new ArrayList<>();
        al.add("Banana");
        al.add("Mango");
        al.add("Apple");
        al.add("Guava");
        System.out.println("Before Sorting:");

        for (String s:al
             ) {
            System.out.println(s);
        }
        //Sorting in Reverse Order

        Collections.sort(al,Collections.reverseOrder());
        System.out.println("After Sorting:");
        for (String s1:al
             ) {
            System.out.println(s1);
        }
    }
}
