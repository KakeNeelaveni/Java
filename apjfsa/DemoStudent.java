//program for object creation for arrays
package com.apjfsa;

public class DemoStudent {
	
	int id;
	String name;
	int age;
	

	public DemoStudent(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	


	@Override
	public String toString() {
		return "Student [id="+id +", name="+name+ ", age="+age+"]";
	}



	
}
