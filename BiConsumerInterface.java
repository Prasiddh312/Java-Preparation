
//BiConsumer Interface accepts two input arguments and does not return any result.

import java.util.function.BiConsumer;

public class BiConsumerInterface {

    static void ShowDetails(String name,Integer age){
        System.out.println(name+" "+age);
    }


    public static void main(String[] args) {
        BiConsumer<String,Integer> biCon=BiConsumerInterface::ShowDetails;
        biCon.accept("Prasiddh",24);
        biCon.accept("Shreyansh",24);
    }
}