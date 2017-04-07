package com.denken.assign4.four;

public class Car {

	String brand;
	String licensePlate;
	String chassisNumber;
	String color;

	String carBrandName(){
		String brand = "BMW";
		return brand;
	}

	String carLicensePlate(){
		return licensePlate;
	}

	String carChassisNumber(){
		return chassisNumber;
	}

	String carColor(){
		String color = "Black";
		return color;
	}

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.brand = "Audi";
		c1.color = "White";
		c1.licensePlate = "ILUVMOM";
		c1.chassisNumber = "1FD04EGVA9";

		System.out.println(c1.carBrandName());
		System.out.println(c1.carColor());
		System.out.println(c1.carLicensePlate());
		System.out.println(c1.carChassisNumber());
	}

}

