import java.util.ArrayList;
import java.util.Collections;

public class ComparableSort {
    public static void main(String[] args) {
        ArrayList<StudentComparable> al=new ArrayList<>();
        al.add(new StudentComparable(101,"Prasiddh",24));
        al.add(new StudentComparable(103,"Richa",25));
        al.add(new StudentComparable(102,"Kajal",23));
        al.add(new StudentComparable(104,"Rajul",24));

        Collections.sort(al);
        for (StudentComparable st:al
             ) {
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

    }
}
