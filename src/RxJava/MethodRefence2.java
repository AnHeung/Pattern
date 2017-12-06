package RxJava;

import java.util.function.IntBinaryOperator;

public class MethodRefence2 {

	public static void main(String[] args) {
		
		IntBinaryOperator operator;
		
		operator = (x,y)->Calculator.staticMethod(x, y);
		
		System.out.println("결과 1 정적메서드: "  + operator.applyAsInt(1, 5));
		
		operator = Calculator::staticMethod;
		System.out.println("결과 2 정적메서드 참조:" + operator.applyAsInt(1, 5));
		
		Calculator calc = new Calculator();
		operator = (x,y)-> calc.instanceMethod(x, y);
		System.out.println("결과 3 인스턴스 메서드 : " + operator.applyAsInt(4, 8));
		
		operator = calc::instanceMethod;
		System.out.println("결과 4 인스턴스 메서드 참조 "+operator.applyAsInt(4, 8));
		
		
//		operator = new IntBinaryOperator() {
//			
//			@Override
//			public int applyAsInt(int x, int y) {
//				return Calculator.staticMethod(4, 8);
//			}
//		};
		
	}
}


