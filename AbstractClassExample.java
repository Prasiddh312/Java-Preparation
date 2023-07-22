
abstract class Animal{
    public abstract void animalSound();//Abstract method does not have Body

    public void sleep(){
        System.out.println("Zzz");
    }
}

class Dog extends Animal{

    //The Body Of animalSound is Provided here.
    public void animalSound()
    {
        System.out.println("The Dog Barks");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {

         Dog myDog =new Dog();
         myDog.animalSound();
         myDog.sleep();

    }
}
