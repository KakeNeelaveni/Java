package com.apjfsa;

public class Square2 implements Shapes {

	int side;
	//constructor with parameter side
	public Square2(int side){
	//super();
	this.side=side;
	}
   
	public int area(){
	  int area=side*side;
	  return area;
	}

	public int perimeter(){
	  int perimeter=4*side;
	  return perimeter;
	}

	/*public int surfacearea() {
		System.out.println("surfacearea");
		return 1;
	}*/
	public static void main(String args[]){

	Square2 s=new Square2(25);
	int a=s.area();
	System.out.println("Area:"+a);
	//System.out.println("Area:"+s.area());
	System.out.println("perimeter:"+s.perimeter());
	System.out.println("surfaceares:"+s.surfacearea());
	
    Shapes shape=new Circle3(20);
    System.out.println("Area="+shape.area());
    System.out.println("perimeter="+shape.perimeter());
    
    Shapes.msg();
    
    ThreeDShape ds=new Cube(25);
    System.out.println("Area="+ds.volume());
	}

}
