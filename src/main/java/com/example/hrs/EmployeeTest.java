package com.example.hrs;
import com.example.hr.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        // Creating an instance of the Employee class
        Employee emp = new Employee("John Doe", 101, 55000.00);

        // Calling the methods to print employee's name and salary
        emp.printName();
        emp.printSalary();
    }
}