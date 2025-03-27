package Sorting;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

class Student  implements Comparable<Student>{

    int age;
    String name;
    Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString()
    {
        return "Age :" + age + "- Name : " + name + "\n";
    }

    public int compareTo(Student student){
        return (this.name).compareTo(student.name);
    }

    public int getAge()
    {
        return age;
    }
    public String  getName()
    {
        return name;
    }
}
public class TestComparable2 {
    public static void main(String[] args)
    {
        List<Student> list = Arrays.asList(
                (new Student(21, "Harshit")),
                (new Student(19, "Sparsh")),
                (new Student(22, "Sahil")),
                (new Student(18, "Nancy")),
                (new Student(24, "Dev")),
                (new Student(26, "Amit"))
        );

        System.out.println("Before Sorting : " + list);

        TreeSet<Student> treeSet = new TreeSet<>(list);
        System.out.println("\nSorted in ascending order on the basis of age :\n" + treeSet);

        System.out.println("\nSorted in descending order on the basis of age :\n" + treeSet.reversed());

    }
}
