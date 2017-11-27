package Generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class FruitBoxEx {

	
	
	public static void main(String[] args) {
		
		
//		Box<Apple>appleBox = new Box<Apple>();
		
//		appleBox.add(new Apple());
		
		
		FruitBox<? extends Fruit> fruitBox = new FruitBox<>();
		
		FruitBox<? extends Fruit> appleBox = new FruitBox<>();
		
		FruitBox<? extends Fruit> grapeBox = new FruitBox<>();
		
		System.out.println(Juicer.makeJuice(fruitBox));
		
		System.out.println(Juicer.makeJuice(appleBox));
		
		
		Collections.sort(appleBox.getList() , new FruitComp());
		
		Collections.sort(grapeBox.getList(), new FruitComp());
		
		
//		System.out.println(Juicer.<Fruit>makeJuice(fruitBox));
//		
//		System.out.println(Juicer.<Apple>makeJuice(appleBox));
//		
//		Box box = null;
		
		
//		box = (Box)objBox;
		
//		objBox = (Box<Object>)box;
		
		Box<Object>objBox = null;
		
		Box<String>stringBox = null;
//		
//		stringBox = (Box<String>)objBox;
//		
//		objBox = (Box<Object>)stringBox;
		
		Box<? extends Object>wBox = new Box<String>();
		
	     
		
	}

}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {
	
}

class AppleComp implements Comparator<Apple>{

	@Override
	public int compare(Apple a1, Apple a2) {
		return a1.weight - a2.weight;
	}
}

class GrapeComp implements Comparator<Grape>{

	@Override
	public int compare(Grape g1, Grape g2) {
		return g1.weight - g2.weight;
	}
}

class FruitComp implements Comparator<Fruit>{

	@Override
	public int compare(Fruit f1, Fruit f2) {
		return f1.weight - f2.weight;
	}
}

