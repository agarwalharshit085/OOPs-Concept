package Polymorphism.CompileTimePolymorphism;

public class TestPolymorphism {

    void show(){
        System.out.println("Hello");
    }
    void show(String name){
        System.out.println("Hello " + name);
    }

    public static void main(String[] args)
    {
        TestPolymorphism testPolymorphism = new TestPolymorphism();
        testPolymorphism.show();
        testPolymorphism.show("Harshit");
    }
}
