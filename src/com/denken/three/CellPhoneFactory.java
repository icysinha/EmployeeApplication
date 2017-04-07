package com.denken.three;

public interface CellPhoneFactory {
	
	public CellPhone manufactCellPhone(Specification spec);
	public CellPhone repairCellPhone(String damageInformation, CellPhone phone);
 
}
