package com.denken.one;

public class Shop{
	String shopName;
	Integer ratings;
	
	public String buyMobile(){
		String name = "OnePlus 3";
		return name;
	}
	
	public CellPhone reviewAndBuyMobile(){
		CellPhone c1 = new CellPhone();
		
		c1.brand = "Motorola";
		c1.os = "Android V6";
		c1.imei = 0000;
		
		return c1;
	}
	
}