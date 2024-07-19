package com.revision;

public class Manager extends Employee1 {
	String department;

	public Manager(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}

	@Override
	public void details(int bonus) {
		System.out.println(salary + bonus);
		super.details(bonus);
	}

	public static void main(String[] args) {
		Manager emp = new Manager("Ram", 20000, "Sales");
		emp.details(5000);
		System.out.println("Employee Name=" + emp.name + "\tSalary=" + emp.salary + "\tdepartment=" + emp.department);

	}

}
