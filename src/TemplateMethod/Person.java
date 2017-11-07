package TemplateMethod;

public abstract  class Person {

	
	void readyToBattle(){
		startTraning();
		prepareWeapon();
		prepareArmor();
		if(isUsingPrepareOther()){
			prepareOther();
		}
	}
	
	private final void startTraning() {
		System.out.println("기본 체력 단력 시작");
	}
	
     boolean isUsingPrepareOther() {
		return false;
	}

	 abstract void prepareArmor();

	 abstract void prepareWeapon();
	
	 void prepareOther(){
		 
	 }
}
