//write a program using method overriding
package com.apjfsa;
//super class Employee1
 class Employee1 {
	String name;
	int basicSalary;
	//Employee1 constructor
	public Employee1(String name, int basicSalary) {
		this.name = name;
		this.basicSalary = basicSalary;
	}
	// Method to calculate total salary
	public int total_Salary() {
		return basicSalary;
	}

}
 
class PermanentEmployee extends Employee1{
	int bonus;

	public PermanentEmployee(String name, int basicSalary,int bonus) {
		super(name, basicSalary);
		this.bonus=bonus;
	}

    // Method overriding to calculate total salary for permanent employee

	@Override
	public int total_Salary() {
		
		return basicSalary+bonus;
	}
}

class ContractEmployee extends Employee1{
	
	int daysWorked;
	int dailywage;
	public ContractEmployee(String name, int basicSalary,int daysWorked,int dailywage) {
		super(name, basicSalary);
		this.daysWorked=daysWorked;
		this.dailywage=dailywage;
	}
	// Method overriding to calculate total salary for contract employee
	@Override
	public int total_Salary() {
		
		return basicSalary+(daysWorked*dailywage);
	}
	
}

 public class EmployeeSalary{
	 //main method
	public static void main(String[] args) {
        // Creating object for permanent employee 
        PermanentEmployee permanentEmployee = new PermanentEmployee("Srinivas", 30000, 5000);
        System.out.println("Total salary for permanent employee " + permanentEmployee.name+" Rs" + permanentEmployee.total_Salary());

        // Creating object for contract employee 
        ContractEmployee contractEmployee = new ContractEmployee("Arjun", 0, 160, 100);
        System.out.println("Total salary for contract employee: " + contractEmployee.name+" Rs"+ contractEmployee.total_Salary());

		
	}
}
