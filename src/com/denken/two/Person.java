package com.denken.two;

public class Person{
	String name;
	String job;
	
	String eating(){
		System.out.println(name + " is eating");
		
		Restaurant r1 = new Restaurant();
		r1.restaurantName = "Buffalo Wild Wings";
		r1.ratings = 5;
		String food = r1.orderFood();
		System.out.println(name + " is eating " + food + " at " + r1.restaurantName);
		return food;
	}
	
		
	Dish pickupOrder(){
		
		System.out.println(name + " ordered Pick up");
		
		Restaurant r1 = new Restaurant();
		r1.restaurantName = "Paradise";
		r1.ratings = 4;
		Dish foodName = r1.pickUpFood();
		System.out.println(name + " ordered " + foodName.dishName + " at " + r1.restaurantName + " for Pickup");
		return foodName;
	}
	
	Dish onlineOrder(){
		
		System.out.println(name + " ordered Online");
		
		Restaurant r1 = new Restaurant();
		r1.restaurantName = "India Palace";
		r1.ratings = 5;
		Dish foodNameNew = r1.onlineFood();
		System.out.println(name + " ordered " + foodNameNew.dishName + " at " + r1.restaurantName + " by Online");
		return foodNameNew;
	}
	
	
	public static void main(String[] args){
		Person p1 = new Person();
		p1.name = "Balu";
		p1.job = "Teaching Assistant";
		p1.eating();
		
		Person p2 = new Person();
		p2.name = "Siva";
		p2.job = "Developer";
		p2.pickupOrder();
		
		Person p3 = new Person();
		p3.name = "Suresh";
		p3.job = "Engineer";
		p3.onlineOrder();
	}
	
}