class Animals{
    void eat(){
        System.out.println("Eating....");
    }
}

class Dogs extends Animal{
    void bark(){
        System.out.println("Barking");
    }
}
class BabyDog extends Dogs{
    void weep(){
        System.out.println("Weeping");

    }
}



public class MultilevelInheritance {
    public static void main(String[] args) {

        BabyDog d= new BabyDog();
        d.weep();
        d.eat();
        d.bark();
    }
}
