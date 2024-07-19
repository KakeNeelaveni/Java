package com.apjfsa;

public class DemoMethodOverLoading {
	
	double avg(int a,int b) {
		double avg=(a+b)/2;
		return avg;
	}
	double avg(int a,int b,int c) {
		double avg=(a+b+c)/3;
		return avg;
	}
	double avg(int a,int b,int c,int d) {
		double avg=(a+b+c+d)/4;
		return avg;
	}

	public static void main(String[] args) {
		DemoMethodOverLoading dload=new DemoMethodOverLoading();
		System.out.println("Average of two i/p:"+dload.avg(23,33));
		System.out.println("Average of three i/p:"+dload.avg(76,32,49));
		System.out.println("Average of four i/p:"+dload.avg(80,12,56,90));
		//System.out.println("Average of two i/p:"+dload.avg(23));
	}

}
