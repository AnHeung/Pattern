package TemplateMethod;

public class Archer extends Person{

	@Override
	void prepareArmor() {
		
	}

	@Override
	void prepareWeapon() {
		System.out.println("활 장착");
	}
	
	@Override
	boolean isUsingPrepareOther() {
		return true;
	}
	
	@Override
	void prepareOther() {
		System.out.println("화살 장착");
	}
	
}
