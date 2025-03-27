package Sorting;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

class Employee implements Comparable<Employee>{
    private String name;
    private int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name='" + name + "'";
    }

    @Override
    public int compareTo(Employee e) {
        return Integer.compare(this.id, e.id); // More concise way to compare IDs
    }

    public int getId() {
        return id;
    }
}
public class TestComparable {
    public static void main(String[] args) {
        List<Employee> listEmp = Arrays.asList(
                new Employee("Amit", 4),
                new Employee("Junaid", 5),

                new Employee("Sunil", 1),
                new Employee("Kashish", 2),
                new Employee("Mudit", 3),
                new Employee("Rafiq", 6)
        );

        System.out.println("List of Employees:");
        System.out.println(listEmp);

        TreeSet<Employee> treeSet = new TreeSet<>();
        treeSet.addAll(listEmp); // Adding employees to TreeSet for sorted order

        System.out.println("\nSorted Employees in ascending TreeSet:");
        System.out.println(treeSet);

        System.out.println("\nSorted Employees in descending TreeSet:");
        System.out.println(treeSet.reversed());
    }
}