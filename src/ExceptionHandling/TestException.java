package ExceptionHandling;

import java.util.Scanner;

public class TestException {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Values");
        int a = sc.nextInt();
        int b = sc.nextInt();

        try{
            int c = a / b;     // in the try block we write the risky code
            System.out.println("Division is : " +c);
        } catch(ArithmeticException e){     // we catch the exception and then print it or we can
                                    // write the alternative to remove the exception
            System.out.println(e);
            e.printStackTrace();
        } finally {
            System.out.println("Execution is successfull");
        }
    }
}
