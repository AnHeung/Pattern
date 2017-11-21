package Observer2;

public interface InterSubject {

	void add(InterObserver observer);
	void remove(InterObserver observer);
	void notifyObservers();
}
