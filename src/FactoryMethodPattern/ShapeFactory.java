package FactoryMethodPattern;

public class ShapeFactory {

	public Shape getShape(String name) {

		if (name == null) {
			return null;
		}
		Shape shape = null;

		if (name.equalsIgnoreCase("circle")) {
			shape = new Circle();
		} else if (name.equalsIgnoreCase("square")) {
			shape = new Square();
		}
		return shape;
	}
}
