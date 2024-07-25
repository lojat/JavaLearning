package collection.ex;
// import ArrayList class from java.util package
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		//declare arrayList variable
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		//add elements
		arrayList.add(100);
		arrayList.add(378);
		arrayList.add(27536);
		arrayList.add(34);
		arrayList.add(Integer.parseInt("7635"));
		
		//get length of arrayList
		int len = arrayList.size();
		System.out.println("Length of arrayList: "+len);
		
		//add element to specific index
		arrayList.add(3,333);
		
		//clone arraylist its return object of new arraylist 
		ArrayList<Integer> clonArrLst = (ArrayList<Integer>) arrayList.clone();
		
		arrayList.getClass();
		
		//display arrayList 
		System.out.println("Display by for loop:");
		for(int i=0;i<len;i++) {
			System.out.print(arrayList.get(i)+" ");
		}
		
		//display clone arrayList by for Each loop 
		System.out.println("\nDisplay cloneArrLst by forEach Loop:");
		for(int i:clonArrLst) {
			System.out.print(i+" ");
		}
		
		//display by forEach Method
		System.out.println("\nDisplay by array list for Ecah Method");
		arrayList.forEach((i)->{
			System.out.print(i+" ");
		});
	}

}
