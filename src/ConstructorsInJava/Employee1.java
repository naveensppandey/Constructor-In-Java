package ConstructorsInJava;

/*
 * Write a Java program using constructor, getter and setter methods
 * for Employee having id, name, salary, and ssn.
 */

class Employee {

    // Private Data Members
    private int id;
    private String name;
    private float salary;
    private String ssn;

    // Parameterized Constructor
    public Employee(int id, String name, float salary, String ssn) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.ssn = ssn;
    }

    // Getter Methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public String getSsn() {
        return ssn;
    }

    // Setter Methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}

public class Employee1 {

    public static void main(String[] args) {

        // Creating Employee Object
        Employee naveen = new Employee(143, "Naveen", 1230000.50f, "2375397486");

        // Display Employee Details
        System.out.println("Employee ID      : " + naveen.getId());
        System.out.println("Employee Name    : " + naveen.getName());
        System.out.println("Employee Salary  : " + naveen.getSalary());
        System.out.println("Employee SSN     : " + naveen.getSsn());

        // Updating Employee Details using Setter Methods
        naveen.setSalary(1500000.00f);
        naveen.setName("Naveen Pandey");

        System.out.println("\nAfter Updating Employee Details:");

        System.out.println("Employee ID      : " + naveen.getId());
        System.out.println("Employee Name    : " + naveen.getName());
        System.out.println("Employee Salary  : " + naveen.getSalary());
        System.out.println("Employee SSN     : " + naveen.getSsn());
    }
}