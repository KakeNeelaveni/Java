package com.apjfsa;

public class PramanentEmp extends Employee {
	
	int leaves;
	int bonus;
	int pf;
	
	public PramanentEmp(int id,String n,int s,int l,int b,int p) {
		super(id,n,s);//it will call super class constructor
		leaves=l;
		bonus=b;
		pf=p;
		System.out.println("peremanent employee object created");
	}
	
	void peramanentEmpInfo() {
		System.out.println("Permanent Employee Details:"+leaves+","+bonus+","+pf);
	}

	public static void main(String[] args) {
		PramanentEmp emp=new PramanentEmp(123,"ram",40000,24,5000,2000);
		/*emp.empId=13097;
		emp.empName="Ram";
		emp.salary=30000;
		emp.leaves=30;
		emp.bonus=5000;
		emp.pf=3000;*/
		emp.emoInfo();
		emp.peramanentEmpInfo();
		
		

	}

}
