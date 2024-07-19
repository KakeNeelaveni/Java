package com.apjfsa;
//class declaration
public class ArrayOfEmployee {
	//instance variables
	int id;
	String name;
	int salary;
	int phno;
	//constructor using fields
	public ArrayOfEmployee(int id, String name, int salary, int phno) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.phno = phno;
	}
    //toString method to print the records in an order
	@Override
	public String toString() {
		
		return "Employee [id="+id +", name="+name+ ", salary="+salary+",phone number="+phno+"]";
	}

	
	

}
