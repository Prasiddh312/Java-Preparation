//Example of Lambda Expression with Multiple Parameters

interface Addable{
    int add(int a,int b);
}

public class LambdaExpression3 {
    public static void main(String[] args) {
        Addable ad=(a,b)->(a+b);
        System.out.println(ad.add(10,20));

    }
}
