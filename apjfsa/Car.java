//single level inheritance
package com.apjfsa;

public class Car extends Vehicle {
	
	String model;
	String fuel;
	String color;
	SonyMusicSystem sonym;
	
	void carDetails() {
		System.out.println("Car Details:"+"\nCar Model:"+model+"\nfuel Type:"+fuel+"\nColour:"+color
				+"\nMusic System details:"+sonym.model+",price:"+sonym.price+",volume:"+sonym.volume);
	}

	public static void main(String[] args) {
		Car benz=new Car();
		String n="Benz";
		benz.name=n;
		//benz.name="Benz Car";
		benz.no_ofwheels=4;
		benz.speed=300;
		benz.color="White";
		benz.model="2.1GLA";
		benz.fuel="Petrol";
		
		SonyMusicSystem s=new SonyMusicSystem(20000,"sonym",200);
		benz.sonym=s;
		
		benz.vehicleInfo();
		benz.carDetails();
		
		

	}

}
