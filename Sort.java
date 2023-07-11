import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(101,"Prasiddh",24));
        al.add(new Student(103,"Richa",25));
        al.add(new Student(102,"Kajal",23));
        al.add(new Student(104,"Nidhi",26));

        System.out.println("*******Sorting By Names**********");
        Collections.sort(al, new NameComparator());
        for (Student st:al) {
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

        System.out.println("******Sorting By Age*******");
        Collections.sort(al,new AgeComparator());
        for (Student st:al) {
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
