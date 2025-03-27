package EncapsulationMain.encapsulation;

import java.util.Scanner;

class Employee{
    int id;
    String name;
    int salary;
    public Employee(int id, String name, int salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class Encapsulation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your id name and Salary");

        int id = sc.nextInt();
        String name = sc.next();
        int salary = sc.nextInt();

        Employee obj = new Employee(id, name, salary);
        System.out.println("Id : " + obj.id);
        System.out.println("Name : " + obj.name);
        System.out.println("Salary : " + obj.salary);

    }
}
