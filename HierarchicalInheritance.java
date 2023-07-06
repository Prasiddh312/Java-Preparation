class Animall{
    void eat(){
        System.out.println("Eating..");
    }

}
class Dog extends Animall{
    void bark(){
        System.out.println("Barking...");

    }
}
class Cat extends Animall{
    void meow(){
        System.out.println("Meowing...");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog d= new Dog();
        Cat c= new Cat();
        d.bark();
        d.eat();
        c.eat();
        c.meow();


    }
}
