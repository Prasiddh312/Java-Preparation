//An Interface that contains exactly one abstract method is known as functional interface.

@java.lang.FunctionalInterface
interface Sayables{
    void say (String msg);

}

public class FunctionalInterface implements Sayables {
        public void say(String msg){
            System.out.println(msg);
        }
    public static void main(String[] args) {
        FunctionalInterface fie=new FunctionalInterface();
        fie.say("Hello There");

    }
}
