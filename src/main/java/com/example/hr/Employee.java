package com.example.hr;

public class Employee {
    private String name;
    private int id;
    private double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to print the employee's name
    public void printName() {
        System.out.println("Employee Name: " + name);
    }

    // Method to print the employee's salary
    public void printSalary() {
        System.out.println("Employee Salary: " + salary);
    }
}
