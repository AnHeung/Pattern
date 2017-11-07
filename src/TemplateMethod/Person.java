package TemplateMethod;

public abstract  class Person {

	//주석 테스트
	
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
