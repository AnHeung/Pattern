package Observer2;

public class Hero2 implements InterHeroes , InterObserver{

	public Hero2(InterSubject team) {
		System.out.println("히어로2 합류");
	    team.add(this);
	}
	
	@Override
	public void update(EnemyStatus status) {
		this.Behavior(status);
	}

	@Override
	public void Behavior(EnemyStatus status) {
		
		switch(status){
		 case NONE : System.out.println("HERO2 :  아무일도 없다"); break;
		 case APPEAR : System.out.println("HERO2 : 장비 장착"); break;
		 case ATTACK : System.out.println("HERO2 : 공격 "); break;
		 case DISAPPEAR : System.out.println("HERO2: 퇴각"); break;
		}
	}

}
