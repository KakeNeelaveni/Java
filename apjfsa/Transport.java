//program using multilevel inheritance.
package com.apjfsa;
//super class
public class Transport {
	//instance variable	
	String type_of_transport;
	String mode_of_transport;
	
	//instance method
	void TransportDetails() {
		System.out.println("Transportation Details:"+"\nType of Transport:"+type_of_transport+
				"\nMode of Transport:"+mode_of_transport);	}

}

//sub class of Transport class or supper class of Fourwheeler class
 class RoadTransport extends Transport{
	//instance variable
	String road_type;
	int distance;
	
	
	//instance method
	void road_details() {
		
		System.out.println("Road Transport Details:"+"\nRoad Type:"+road_type+"\nDistance:"+distance);
	}
  //main method
	public static void main(String[] args) {
		//object creation 
		RoadTransport rt=new RoadTransport();
		rt.type_of_transport="Road Transport";
		rt.mode_of_transport="Private";
		rt.road_type="Highway";
		rt.distance=2000;
		rt.TransportDetails();
		rt.road_details();
		

	}

}
 
//sub class of RoadTransport
 class Fourwheeler extends RoadTransport {
	//instance variable
	String name_ofwheeler;
	int speed;
	int Transport_price;
	//instance method
	void fourwheelerDetails() {
		System.out.println("Four wheeler Details:"+"\nName of wheeler:"+name_ofwheeler+
				"\nSpeed:"+speed+"\nTransport price:"+Transport_price);
	}
   //main method
	public static void main(String[] args) {
		//object creation
		Fourwheeler fw=new Fourwheeler();
		fw.type_of_transport="Road Transport";
		fw.mode_of_transport="private";
		fw.road_type="Highway";
		fw.distance=3000;
		fw.name_ofwheeler="Car";
		fw.speed=350;
		fw.Transport_price=1000;
		fw.TransportDetails();
		fw.road_details();
		fw.fourwheelerDetails();
		
	}

}


