package Generic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Box<T> {

	ArrayList<T>list = new ArrayList<T>();
	
	void add(T item){
		list.add(item);
	}
	
	T get(int i){
		return list.get(i);
	}
	
	ArrayList<T>getList(){
		return list;
	}
	
	int size(){
		return list.size();
	}
	
	static <T> void sort(List<T> list, Comparator<? super T> c){
		
	}
	
	public String toString(){
		return list.toString();
	}
	
}
