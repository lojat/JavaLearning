package lab12;

import java.util.ArrayList;
import java.util.List;


// generic Container class that takes a type parameter T
public class Container <T>{
	
	// a private field to store the collection of objects, which can be a List<T> 
	private List<T> objects=new ArrayList<T>();
	
	
	//adds an object of type T to the collection.
	public void add(T obj) {
		objects.add(obj);
	}
	
	
	// removes an object of type T from the collection.
	public boolean romove(T obj) {
		return objects.remove(obj);
	}
	
	
	//returns the object at the specified index in the collection
	public T get(int index) {
		return objects.get(index);
	}
	
	
	//returns the number of objects in the collection.
	public int size() {
		return objects.size();
	}
	
}
