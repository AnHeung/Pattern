package Generic;


public class Juicer {

	 static <T extends Fruit> Juice makeJuice(FruitBox<T> box){
			
			String tmp = "";
			
			for(Fruit f : box.getList()){
				tmp += f+ " ";
			}
			return new Juice(tmp);
		}
	 
}


