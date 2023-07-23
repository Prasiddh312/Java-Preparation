//Example of Lambda Expression with Single Parameter

interface Saying{
    public String say(String name);
}

public class LambdaExpression2 {
    public static void main(String[] args) {
        //Lambda Expression
        Saying s1=(name)->{
            return "Hello,"+name;
        };
        System.out.println(s1.say("Prasiddh"));
    }
}
