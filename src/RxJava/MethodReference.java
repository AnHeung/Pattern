package RxJava;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;

public class MethodReference {

	public static void main(String[] args) {
		
		String[] strings = new String[]{"6","5","4","3","2","1"};
		
		List<String>list = Arrays.asList(strings);
		
		list.forEach((s)->System.out.println(s));
		
//		list.forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//			}
//		});
		
		list.forEach(System.out::println);
		
		
	}
}


