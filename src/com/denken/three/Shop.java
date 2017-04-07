package com.denken.three;

public class Shop {

	
	public static void main(String[] args) {
		CellPhoneFactory cellFactory = new CellPhoneFactoryImplementation();
		
		Specification spec1 = new Specification();
		
		spec1.color = "Black";
		spec1.screenSize = 5.5;
		spec1.os = "Android";
		spec1.memory = "32GB";
		
		CellPhone phone = cellFactory.manufactCellPhone(spec1);
		System.out.println("I got " + phone.brand + " in my phone.");
	}
}
