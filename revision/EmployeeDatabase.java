//Design a simple Java program to manage an employee database using a HashMap. 
//The program should allow adding, updating, and deleting employee records based on employee IDs.
package com.revision;

import java.util.HashMap;
import java.util.Scanner;

class Employee {
    private String id;
    private String name;
    private String department;

    public Employee(String id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Department: " + department;
    }
}

public class EmployeeDatabase {
    private HashMap<String, Employee> database;

    public EmployeeDatabase() {
        database = new HashMap<>();
    }

    public void addEmployee(String id, String name, String department) {
        if (database.containsKey(id)) {
            System.out.println("Employee ID already exists. Use update option to modify existing employee.");
        } else {
            Employee employee = new Employee(id, name, department);
            database.put(id, employee);
            System.out.println("Employee added successfully.");
        }
    }

    public void updateEmployee(String id, String name, String department) {
        Employee employee = database.get(id);
        if (employee != null) {
            employee.setName(name);
            employee.setDepartment(department);
            System.out.println("Employee updated successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void deleteEmployee(String id) {
        if (database.remove(id) != null) {
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void displayEmployee(String id) {
        Employee employee = database.get(id);
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee not found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeDatabase employeeDatabase = new EmployeeDatabase();

        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Display Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    String addId = scanner.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String addName = scanner.nextLine();
                    System.out.print("Enter Employee Department: ");
                    String addDepartment = scanner.nextLine();
                    employeeDatabase.addEmployee(addId, addName, addDepartment);
                    break;
                case 2:
                    System.out.print("Enter Employee ID: ");
                    String updateId = scanner.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Enter Employee Department: ");
                    String updateDepartment = scanner.nextLine();
                    employeeDatabase.updateEmployee(updateId, updateName, updateDepartment);
                    break;
                case 3:
                    System.out.print("Enter Employee ID: ");
                    String deleteId = scanner.nextLine();
                    employeeDatabase.deleteEmployee(deleteId);
                    break;
                case 4:
                    System.out.print("Enter Employee ID: ");
                    String displayId = scanner.nextLine();
                    employeeDatabase.displayEmployee(displayId);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
