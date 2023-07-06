//Method Overloading by changing the data type.

class Addition{
    static int add (int a,int b){return a+b;}
    static double add (double a,double b){return a+b;}


}


public class TestOverloading2 {
    public static void main(String[] args) {
        System.out.println(Addition.add(11,12));
        System.out.println(Addition.add(12.3,0.7));
    }
}
