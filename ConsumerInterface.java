import java.util.function.Consumer;

//The Consumer Interface accepts a single argument and does not return any result.
public class ConsumerInterface {
    static void printMessage(String name){
        System.out.println("Hello "+name);
    }

    static void printVal(int val){
        System.out.println(val);
    }
    public static void main(String[] args) {
        Consumer<String>con1=ConsumerInterface::printMessage;
        con1.accept("Prasiddh");

        Consumer<Integer>con2=ConsumerInterface::printVal;
        con2.accept(312);

    }
}
