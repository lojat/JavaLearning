package genrics;

import java.util.ArrayList;
import java.util.List;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list = new ArrayList();// without generic we can store any kind of data in collection 
		
		list.add(10);//int
		list.add("Hello");//string
		list.add(false);//boolean
		list.add(null);//null
		list.add(null);
		list.add('c');//char
			
		for( int i =0;i< list.size();i++) {
			System.out.print(list.get(i)+"   ");
		}
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(100);
		list1.add(80);
//		list1.add("187");
//		list1.add(true); but with generic we can not store data of another type
		list1.add(07);
		System.out.println();
		for(Integer l: list1) {
			System.out.print(l+"  ");
		}
	}

}
