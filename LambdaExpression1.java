
//Example of Lambda Expression with No Parameter

interface Speakable{
    public String speak();

}

public class LambdaExpression1 {
    public static void main(String[] args) {
        //Lambda Expression
        Speakable s=()->{
          return "I have nothing to Speak";
        };
        System.out.println(s.speak());
    }
}
