package com.denken.one;

public class Person{
	String name;
	String job;
	
	String shopping(){
		System.out.println(name + " is doing shopping");
		
		Shop s1 = new Shop();
		s1.shopName = "BestBuy";
		s1.ratings = 5;
		String mobileName = s1.buyMobile();
		return mobileName;
	}
	
	void windowShopping(){
		System.out.println(name + " is doing window shopping");
	}
	
	void present(String giftName){
		System.out.println(name + " presented " + giftName + " to his friend");
	}
	
	CellPhone onlineShopping(){
		System.out.println(name + " is doing online shopping");
		
		Shop s1 = new Shop();
		s1.shopName = "BestBuy";
		s1.ratings = 4;
		CellPhone cellName = s1.reviewAndBuyMobile();
		System.out.println(name + " bought " + cellName.brand);
		return cellName;
	}
	
	
	public static void main(String[] args){
		Person p1 = new Person();
		p1.name = "Balu";
		p1.job = "Teaching Assistant";
		String gift = p1.shopping();
		p1.present(gift);
		
		Person p2 = new Person();
		p2.name = "Siva";
		p2.job = "Developer";
		p2.windowShopping();
		
		Person p3 = new Person();
		p3.name = "Suresh";
		p3.job = "Engineer";
		p3.onlineShopping();
	}
	
}
