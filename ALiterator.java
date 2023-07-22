//Program To iterate arraylist.

import java.util.ArrayList;

public class ALiterator {
    public static void main(String[] args) {

        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<String>alc=new ArrayList<>();

        al.add(1);
        al.add(3);
        al.add(5);
        al.add(2);
        al.add(6);
        //**************************************
        alc.add("Prasiddh");
        alc.add("Richa");
        alc.add("Kajal");
        //Using For Loop.
        for(int i=0;i<al.size();i++
        ){
            System.out.println(al.get(i));
        }
        //Using For Each Loop

        for (Integer num: al
             ) {
            System.out.println("\n"+num);
        }

        for (String name : alc
             ) {
            System.out.println(name);
        }

    }
}