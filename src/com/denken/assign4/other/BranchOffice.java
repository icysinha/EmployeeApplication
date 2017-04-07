package com.denken.assign4.other;

import com.denken.assign4.two.Car;

public class BranchOffice extends Car {
	public static void main(String[] args) {
	
		BranchOffice c1 = new BranchOffice();
		c1.brand = "Audi";
		//c1.color = "White";
		c1.licensePlate = "ILUVMOM";
		//c1.chassisNumber = "1FD04EGVA9";
		
		System.out.println("Car Brand is " + c1.brand + ", " + "License Plate is " + c1.licensePlate + ".");
		
		System.out.println(c1.carBrandName());
		//System.out.println(c1.carColor());
		System.out.println(c1.carLicensePlate());
		//System.out.println(c1.carChassisNumber());
		
	}
	
}
