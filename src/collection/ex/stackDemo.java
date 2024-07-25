package collection.ex;

import java.util.Stack;

//stack work on last come first out 
public class stackDemo {

	public static void main(String[] args) {
		
		//declare stack
		Stack<String> stack = new Stack<String>();
		
		//add some elements
		stack.add("math");
		stack.add("Science");
		stack.add("Hindi");
		
		//push element
		stack.push("English");
		stack.push("So. Science");
		
		//pop element
		stack.pop();
		
		//peek element
		System.out.println(stack.peek());
		
		//all elements 
		stack.forEach((ele)->{
			System.out.print(ele+" ");
		});
		
	}

}
