package Polymorphism.CompileTimePolymorphism;

public class TestMOL {

    void sum(int a , int b){
        System.out.println("Sum is : " + (a+b));
    }
    void sum(){
        int a = 20, b = 30;
        System.out.println("Sum is : " +(a + b));
    }
    public static void main(String args[])
    {
        TestMOL testMOL = new TestMOL();
        testMOL.sum();
        testMOL.sum(5,10);
    }
}
