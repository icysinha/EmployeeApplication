package com.denken.assign4.two;

public class Car {

	public String brand;
	protected String licensePlate;
	private String chassisNumber;
	String color;

	public String carBrandName(){
		return brand;
	}

	protected String carLicensePlate(){
		return licensePlate;
	}

	private String carChassisNumber(){
		return chassisNumber;
	}

	String carColor(){
		return color;
	}

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.brand = "Audi";
		c1.color = "White";
		c1.licensePlate = "ILUVMOM";
		c1.chassisNumber = "1FD04EGVA9";

		System.out.println("Car Brand is " + c1.brand + ", " + 
				"Color is " + c1.color + ", " + 
				"License Plate is " + c1.licensePlate + ", " +
				"Chassis Number is " + c1.chassisNumber + ".");

		System.out.println(c1.carBrandName());
		System.out.println(c1.carColor());
		System.out.println(c1.carLicensePlate());
		System.out.println(c1.carChassisNumber());
	}

}
