package Observer2;

import java.util.ArrayList;
import java.util.List;

public class Avengers implements InterSubject{

	private List<InterObserver> heroes;
	private EnemyStatus status;
	
	
	public Avengers() {
		System.out.println("어벤저스 시작");
		heroes = new ArrayList<InterObserver>();
	}
	
	@Override
	public void add(InterObserver observer) {
		heroes.add(observer);
	}

	@Override
	public void remove(InterObserver observer) {
		if(heroes.contains(observer)){
			heroes.remove(observer);
		}
	}

	@Override
	public void notifyObservers() {
		for(InterObserver observer : heroes){
			observer.update(status);
		}
	}
	
	public void notifyObserver(InterObserver observer){
		observer.update(status);
	}
	
	public void setStatus(EnemyStatus status){
		this.status = status;
		notifyObservers();
	}
	
	public List<InterObserver> getHeroes(){
		return heroes;
	}
}
