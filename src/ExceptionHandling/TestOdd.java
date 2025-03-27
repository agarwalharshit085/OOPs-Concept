package ExceptionHandling;

import java.util.Scanner;
class MyException1 extends Exception
{
    MyException1(String msg) {
        super(msg);
    }
}
class CheckOddNum {
    void checkOdd(int num) throws  MyException1 {
        if (num % 2 != 0) {
            throw new MyException1("You have entered a odd number");
        } else {
            System.out.println("Entered number is even.");
        }
    }
}
public class TestOdd {
    public static void main(String[] args) throws MyException1 {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        CheckOddNum testOdd = new CheckOddNum();
        try {
            testOdd.checkOdd(num);
        } catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
