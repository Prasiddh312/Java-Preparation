// To Convert Array to List
/*1. Using Arrays class asList() method

2. Using Collections class addAll() method

3. Using add() method
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToList {
    public static void main(String[] args) {
        String[] cities={"Boston","Liverpool","Frankfurt","Chicago"};

        //Using Arrays class asList() method
        ArrayList<String> list =new ArrayList<>(Arrays.asList(cities));
        list.add("San jose");
        list.add("Sydney");

        for (String names:list
             ) {
            System.out.println(names);
        }
        System.out.println("\n");
/***************************************************************************************************/

        //2.Using Collection class addAll() method.

        String [] fruits={"apple","mango","Banana","grapes"};
        ArrayList<String> al=new ArrayList<>();
        Collections.addAll(al,fruits);
        al.add("Guava");
        al.add("Peach");

        for (String f:al
             ) {
            System.out.println(f);
        }
        System.out.println("\n");

        //3.Using add() Method.

        String[] products={"macbook air","macbook pro","imac","iphone"};
        ArrayList<String> al1=new ArrayList<>();

        for(int i=0;i<products.length;i++){
            al1.add(products[i]);
        }
        for (String prd:al1
             ) {
            System.out.println(prd);
        }
    }
}
