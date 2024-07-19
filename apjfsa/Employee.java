package com.apjfsa;

public class Employee {
	int empId;
	String empName;
	int salary;
	//No_args Constructor/default
	Employee()
	{
		System.out.println("Employee Object Created");
	}
	
	//Constructor with parameters
	Employee(int id,String n,int sal)
	{
		empId=id;
		empName=n;
		salary=sal;
		
	}
	
	Employee(int id,String n)
	{
		empId=id;
		empName=n;
	}
	void emoInfo() {
		System.out.println("Employee Details:"+empId+"\n Name:"+empName+"\nSalary:"+salary);
	}

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.empId=123;
		emp.empName="Ram";
		emp.salary=100000;
		emp.emoInfo();
		Employee emp2=new Employee(143,"Neelu");
		emp2.emoInfo();
        
		Employee emp1=new Employee(121,"sitha",88000);
		emp1.emoInfo();
	}

}
