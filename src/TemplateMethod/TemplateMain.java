package TemplateMethod;

public class TemplateMain {

	
	public static void main(String[] args) {
		
		Person warrior = new Warrior();
		Person Archer = new Archer();
		
		warrior.readyToBattle();
		System.out.println("");
		Archer.readyToBattle();
	}
}
