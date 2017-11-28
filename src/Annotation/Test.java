package Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


import java.util.ArrayList;

import static java.lang.annotation.ElementType.*;

@Target(FIELD)
@SuppressWarnings("deprecation")
@Retention(RetentionPolicy.SOURCE)
public @interface Test {
	int value() default 1; 
}

@interface TestInfo{
	int   count();
	String testBy();
	String[] testTools();
	TestType testType();  //enum TestType{FIRST, FINAL}
	DateTime testDate();  //자신이 아닌 다른 애너테이션(@DateTime)도 포함가능
	
}

enum TestType{
	FIRST , FINAL
}

@interface DateTime{
	String yymmdd();
	String hhmmss();
}

@TestInfo(
		count = 3 ,
		testBy="Ahn" ,
		testTools = {"JUnit" , "AutoTester"},
		testType = TestType.FINAL,
		testDate = @DateTime(yymmdd="171128" , hhmmss="235959"))
class Test2{	

}

@interface TestStringArray{
	String[] info() default {"aaa" , "bbb"};
	String[] info2() default "ccc";
	
}

@TestStringArray   // @Testinfo(info={"aaa","bbb"} , info2="ccc") 와 동일
class Test3 {
	
}

@interface AnnoTest{
	int id = 100;                //상수 선언 OK
//	String major(int i , int j);  //에러. 매개변수 선언불가
//	String minor() throws Exception; // 에러. 예외 선언 불가
//	ArrayList<T>list();            //에러. 요소의 타입에 타입 매개변수 불가
}

