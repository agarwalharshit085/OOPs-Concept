package Abstraction;

abstract class Animal{
    abstract void sound();
}

class Cat extends Animal{

    void sound(){
        System.out.println("Meoww");
    }
}
class Dog extends Animal{

    void sound(){
        System.out.println("Barkk");
    }
}
public class TestAbstraction {
    public static void main(String args[]){

        Animal animal = new Cat(); // Cat class
        animal.sound();

        animal = new Dog();  // Dog class
        animal.sound();
    }
}
