//Write a program to create a array of Employee objects, initialize and print employee objects.
package com.apjfsa;
//class declaration
 class ArrayEmployee {
	//instance variables
	int id;
	String name;
	int salary;
	int phno;
	//constructor using fields
	public ArrayEmployee(int id, String name, int salary, int phno) {
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


//class declaration
public class Employees {
    //main method
	public static void main(String[] args) {
		//object creation for ArrayOfEmployee class
		ArrayEmployee[] employee=new ArrayEmployee[5];
		//Initialing values for employee using object
		employee[0]=new ArrayEmployee(1,"Geetha",30000,846778378);
		employee[1]=new ArrayEmployee(2,"Shrav",40000,846858379);
		employee[2]=new ArrayEmployee(3,"purna",20000,842709878);
		employee[3]=new ArrayEmployee(4,"Varun",50000,846987837);
		employee[4]=new ArrayEmployee(5,"Arjun",60000,846078378);
		//using for each loop to print employee records
		for(ArrayEmployee emp:employee)
			System.out.println(emp);

	}

}
