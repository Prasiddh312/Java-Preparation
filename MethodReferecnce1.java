/*Method reference is used to refer method of functional interface.
It is compact and easy form of lambda expression.
Each time when you are using lambda expression to just referring a method, you can replace your lambda expression
 with method reference.*/

interface Sayable1{
    void say();
}
public class MethodReferecnce1 {
    public static void saySomething(){
        System.out.println("Hello, I am Static method.");
    }
    public static void main(String[] args) {

        Sayable1 sayable=MethodReferecnce1::saySomething;

        sayable.say();

    }
}
