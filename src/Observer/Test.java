package Observer;

public class Test {

	
	public static void main(String[] args) {
		
		NewsMachine newsMachine = new NewsMachine();
		AnnualSubscriber as = new AnnualSubscriber(newsMachine);
		EventScriber es = new EventScriber(newsMachine);
		
		newsMachine.setNewInfo("오늘 한파" , "전국 영하 15도");
		newsMachine.setNewInfo("오늘 벚꽃" , "꽃구경 가세요");
	}
}
