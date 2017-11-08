package FactoryMethodPattern;

public class ShapeTestMain {

	
	public static void main(String[] args) {
		
		//주석
		Shape circle = new ShapeFactory().getShape("Circle");
		circle.draw();
		Shape square = new ShapeFactory().getShape("square");
		square.draw();
	}
}
