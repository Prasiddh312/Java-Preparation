//Method Overloading-By Changing no. of arguments

class Adder{
    static int add(int a,int b){return a+b;}
    static  int add(int a,int b,int c){return a+b+c;}
    //In this example, we are creating static methods so that
    // we don't need to create instance for calling methods.
}



public class TestOverloading1 {


    public static void main(String[] args) {
        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(11,11,11));

    }
}