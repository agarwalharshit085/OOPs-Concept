package Java8;

@FunctionalInterface
interface Calcable1 {
    void mul1(); // Without return type without parameter
}

@FunctionalInterface
interface Calcable2{
    int mul2();  // With return type without parameter
}

@FunctionalInterface
interface Calcable3{
    int mul3(int a, int b); // With return type with parameter
}

@FunctionalInterface
interface Calcable4 {
    void mul4(int a, int b); // Without return type with parameter
}

public class TestCalcable {
    public static void main(String[] args) {

        Calcable1 a1 = ()->
        {
            int n1 = 10;
            int n2 = 10;
            int c = n1 * n2;
            System.out.println("prod1 is : " +c);
        };
        a1.mul1();

        Calcable2 a2 = ()->
        {
            int n1 = 10;
            int n2 = 20;
            int c = n1 * n2;
            return c;
        };
        System.out.println("prod2 : " + a2.mul2());

        Calcable3 a3 = (int a, int b) -> {
            return a * b;
        };
        System.out.println("prod3 : " + a3.mul3(15 , 25));

        Calcable4 a4 = (int a, int b) -> {
            System.out.println("prod4 : "+(a * b));
        };
        a4.mul4(15, 36);

    }
}
