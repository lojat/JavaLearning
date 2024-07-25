package collection.ex;

import java.util.Stack;

//
//Stack after pushing 10: [10] 
//Stack after pushing 20: [10, 20] Stack after pushing 30: [10, 20, 30]
//Stack after pushing 40: [10, 20, 30, 40] Stack after pushing
//50: [10, 20, 30, 40, 50] Popped element: 50 Top element: 40 
//Stack is not empty: true Stack after clearing: []
//
//Your Task:
//
//Write a Java program to implement the above operations 
//and produce the desired output.

public class stack01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println(stack.push(50));
		
		System.out.println("Pop: "+stack.pop());
		
		System.out.println("Peek: "+stack.peek());
		
		if(stack.empty()) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		stack.clear();
		
		for(int i: stack) {
			System.out.println(i);
		}
	}

}
