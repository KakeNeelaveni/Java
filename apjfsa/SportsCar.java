// Multi level inheritance
package com.apjfsa;

public class SportsCar extends Car {
	
	int no_of_seats;
	int price;
	int no_of_gears;
	String hourse_power;
	
	
	void sptCar() {
		System.out.println("Sports Car Details:"+"\nNo Of Seats:"+no_of_seats+"\nPrice:"+price+"\nno_of_gears:"+no_of_gears+"\nhourse_power:"+hourse_power);
	}

	public static void main(String[] args) {
		
		SportsCar spc=new SportsCar();
		spc.name="Mazda";
		spc.color="Red";
		spc.model="MX-5";
		spc.fuel="Petrol";
		spc.no_of_seats=4;
		spc.no_ofwheels=4;
		spc.price=99000000;
		spc.speed=490;
		spc.hourse_power="180hw";
		spc.no_of_gears=7;
		spc.vehicleInfo();
		spc.carDetails();
		spc.sptCar();

	}

}
