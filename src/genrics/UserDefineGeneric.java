package genrics;

class MyGenric <T>{
	
	T obj;
	
	public void add(T obj) {
		this.obj=obj;
	}
	
	public T get() {
		return obj;
	}
	
}

public class UserDefineGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyGenric<Integer> my = new MyGenric<Integer>();
		
		my.add(190);
		my.add(42366);
//		my.add('h');we can not store another type of data
		my.add(45);
		
		System.out.println(my.get());
		
		
	}

}
