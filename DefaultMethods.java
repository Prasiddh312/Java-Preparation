
interface Sayable2{
    //Default Method
    default void say(){
        System.out.println("Hello,I am default Method.");
    }
    //Abstract Method

    void sayMore(String msg);

    //Static Method

    static void sayLouder(String msg){
        System.out.println(msg);
    }

}


public class DefaultMethods implements Sayable2 {
    public void sayMore(String msg){
        System.out.println(msg);                         //Implementing Abstract Method.
    }
    public static void main(String[] args) {
        DefaultMethods dm=new DefaultMethods();
        dm.say();
        dm.sayMore("Abstract Method");
        Sayable2.sayLouder("Static Method");

    }
}
/***************************NOTE***********************************/
/* After having default and static methods inside the interface, we think about the need of abstract class in
 Java. An interface and an abstract class is almost similar except that you can create constructor in the
 abstract class whereas you can't do this in interface. */