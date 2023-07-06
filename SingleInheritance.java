class Animal{
    void eat(){
        System.out.println("Eating.....");
    }
   static class Dog extends Animal{
        void bark(){
            System.out.println("Barking....");
        }
    }
}

 class SingleInheritance {
    public static void main(String[] args) {
        Animal.Dog d= new Animal.Dog();
        d.bark();
        d.eat();



    }
}
