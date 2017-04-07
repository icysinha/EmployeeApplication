package com.denken.assign4.other;

import com.denken.assign4.two.Car;

public class OtherOffice {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.brand = "Audi";
		//c1.color = "White";
		//c1.licensePlate = "ILUVMOM";
		//c1.chassisNumber = "1FD04EGVA9";
		
		System.out.println("Car Brand is " + c1.brand + ".");
		
		System.out.println(c1.carBrandName());
		//System.out.println(c1.carColor());
		//System.out.println(c1.carLicensePlate());
		//System.out.println(c1.carChassisNumber());
		
	}
	
}
