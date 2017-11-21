package Observer2;

public class Hero1 implements InterHeroes , InterObserver{

	
	public Hero1(InterSubject team) {
		System.out.println("히어로1 합류");
		team.add(this);
	}
	
	@Override
	public void update(EnemyStatus status) {
		this.Behavior(status);
	}

	@Override
	public void Behavior(EnemyStatus status) {
		switch(status){
		
		 case NONE : System.out.println("HERO1 :  아무일도 없다"); break;
		 case APPEAR : System.out.println("HERO1 : 장비 장착"); break;
		 case ATTACK : System.out.println("HERO1 : 공격 "); break;
		 case DISAPPEAR : System.out.println("HERO1: 퇴각"); break;
		}
	}

}
