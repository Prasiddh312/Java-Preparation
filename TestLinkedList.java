import java.util.ArrayList;
import java.util.LinkedList;

//It uses a doubly linked list internally to store the elements. It can store the duplicate elements.
public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> al=new LinkedList<>();
        al.add("Prasiddh");
        al.add("Kajal");
        al.add("Richa");
        al.add("Nidhi");
        al.add("Rajul");
        System.out.println(al);

        al.remove(2);
        System.out.println(al);
        al.set(2,"Kriday");
        System.out.println(al);

        //To iterate on list
        for (String element:al
             ) {
            System.out.println(element);
        }

        al.clear();
        System.out.println(al);


        //NOTE-In ArrayList and LinkedList Operations are same
    }
}
