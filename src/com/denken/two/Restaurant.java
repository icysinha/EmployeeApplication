package com.denken.two;

public class Restaurant{
	String restaurantName;
	Integer ratings;
	
	public String orderFood(){
		String dish = "Chicken Wings";
		return dish;
	}
	
	public Dish pickUpFood(){
		Dish d1 = new Dish();
		
		d1.dishName = "Chicken Biryani";
		d1.spicyLevel = 9;
				
		return d1;
	}
	
	public Dish onlineFood(){
		Dish d1 = new Dish();
		
		d1.dishName = "Chicken Curry";
		d1.spicyLevel = 9;
				
		return d1;
	}
	
}