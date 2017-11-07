package TemplateMethod;

public class Warrior extends Person{

	@Override
	void prepareArmor() {
		System.out.println("갑옷입자");
	}

	@Override
	void prepareWeapon() {
		System.out.println("소드 끼자");
	}
}
