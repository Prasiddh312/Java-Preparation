
interface Sayable{
    public void say();
}

public class WithoutLambda {
    public static void main(String[] args) {
            Sayable s=new Sayable() {
                @Override
                public void say() {
                    System.out.println("I have nothing to say");
                }
            };
            s.say();
    }
}