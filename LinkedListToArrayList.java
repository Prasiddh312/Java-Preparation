import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListToArrayList {
    public static void main(String[] args) {
        LinkedList<String> food=new LinkedList<>();
        food.add("Biryani");
        food.add("Pasta");
        food.add("Pizza");
        food.add("Nachos");

        List<String> list=new ArrayList(food);

        for (String f:list
             ) {
            System.out.println(f);
        }
    }
}
