import java.util.function.Function;

public class FunctionInterface {

    static String show(String msg){
        return "Hello "+msg;
    }
    public static void main(String[] args) {
        Function<String,String>fun=FunctionInterface::show;

        System.out.println(fun.apply("Peter"));
    }
}
