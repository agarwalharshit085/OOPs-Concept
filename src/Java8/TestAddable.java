package Java8;

@FunctionalInterface
interface Addable1{
    void add1(); // Without return type without parameter
}

@FunctionalInterface
interface Addable2{
    int add2();  // With return type without parameter
}

@FunctionalInterface
interface Addable3{
    int add3(int a, int b); // With return type with parameter
}

@FunctionalInterface
interface Addable4{
    void add4(int a, int b); // Without return type with parameter
}

public class TestAddable {
    public static void main(String[] args) {

        Addable1 a1 = ()->
        {
            int n1 = 10;
            int n2 = 10;
            int c = n1 + n2;
            System.out.println("Sum1 is : " +c);
        };
        a1.add1();

        Addable2 a2 = ()->
        {
            int n1 = 10;
            int n2 = 20;
            int c = n1 + n2;
            return c;
        };
        System.out.println("Sum2 : " + a2.add2());

        Addable3 a3 = (int a, int b) -> {
            return a + b;
        };
        System.out.println("Sum3 : " + a3.add3(15 , 25));

        Addable4 a4 = (int a, int b) -> {
            System.out.println("Sum : "+(a + b));
        };
        a4.add4(15, 36);

    }
}
