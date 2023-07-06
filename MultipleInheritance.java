

public class MultipleInheritance implements InterfaceA,InterfaceB,InterfaceC{

    @Override
    public void doSomething() {
        System.out.println("doSomething implementation of concrete class");
    }


    public static void main(String[] args) {
        InterfaceA objA=new MultipleInheritance();
        InterfaceB objB=new MultipleInheritance();
        InterfaceC objC=new MultipleInheritance();

        objA.doSomething();
        objB.doSomething();
        objC.doSomething();

    }
}
