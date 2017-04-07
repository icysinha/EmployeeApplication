package com.denken.three;

public class CellPhoneFactoryImplementation implements CellPhoneFactory {

	public CellPhone manufactCellPhone(Specification spec){
		CellPhone c1 = new CellPhone();
		c1.color = "Black";
		c1.brand = "Android";
		c1.memory = "32GB";
		return c1;
	}
	
	public CellPhone repairCellPhone(String damageInformation, CellPhone phone){
		phone.status = "Repaired";
		
		return phone;
	}   

}
