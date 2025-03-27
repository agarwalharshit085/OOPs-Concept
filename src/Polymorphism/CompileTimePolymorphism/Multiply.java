package Polymorphism.CompileTimePolymorphism;

import java.util.Scanner;

public class Multiply {


    void multiply(int a , int b){
        System.out.println("Multiply is : " + (a * b));
    }
    void multiply(Scanner sc){
        System.out.println("Enter two numbers");
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Multiply is : " +(a * b));
    }
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Multiply multi = new Multiply();

        multi.multiply(sc);
        multi.multiply(5, 10);
    }
}