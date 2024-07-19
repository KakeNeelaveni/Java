//Hierarical inheritance

package com.apjfsa;

public class ContractEmp extends Employee {
	
	String contractPeriod;
	int privillageLeaves;
	int working_days;
	
	void contractempInfo() {
		System.out.println("Contract employee Details:"+contractPeriod+","+privillageLeaves+","+working_days);
	}
      

	public static void main(String[] args) {
		ContractEmp emp=new ContractEmp();
		emp.empId=1324;
		emp.empName="sitha";
		emp.salary=400000;
		emp.privillageLeaves=15;
		emp.working_days=30;
		emp.contractPeriod="3 years";
		emp.contractempInfo();

	}

}
