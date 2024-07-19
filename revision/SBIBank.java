package com.revision;

 class RBI {
    
	int calculateInterest(int r) {
		System.out.println("Super");
		return 0;
	}

	

}

class SBIBank extends RBI{
	int calculateInterest(int r) {
		super.calculateInterest(21);
		System.out.println("Child");
		
		return r;
	}
	public static void main(String[] args) {
		
		SBIBank sbi=new SBIBank();
		sbi.calculateInterest(34);
		
		
	}

}
