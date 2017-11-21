package Observer2;

public class HeroStart {

	public static void main(String[] args) {
		
		
		Avengers avengers = new Avengers();
		InterHeroes hero1 = new Hero1(avengers);
		InterHeroes hero2 = new Hero2(avengers);
		
		avengers.setStatus(EnemyStatus.NONE);
		avengers.setStatus(EnemyStatus.APPEAR);
		avengers.setStatus(EnemyStatus.ATTACK);
		avengers.setStatus(EnemyStatus.DISAPPEAR);
	   
		avengers.setStatus(EnemyStatus.ATTACK);
		avengers.remove((InterObserver)hero1);
		avengers.setStatus(EnemyStatus.DISAPPEAR);
	}
}
