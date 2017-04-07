package com.denken.assign4.three;

public class Community {

	public static void main(String[] args) {
		
		BullDog d1 = new BullDog();
		d1.name = "Snoopy";
		d1.color = "Black";
		d1.noOfLegs = 3;
		
		PugDog d2 = new PugDog();
		d2.name = "Tommy";
		d2.color = "Black";
		d2.noOfLegs = 4;
		
		System.out.println(d1.dogName());
		System.out.println(d1.dogColor());
		System.out.println(d1.tellNoOfLegs());
		
		System.out.println(d2.dogName());
		System.out.println(d2.dogColor());
		System.out.println(d2.tellNoOfLegs());
		
	}
}
