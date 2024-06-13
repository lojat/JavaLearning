package OverLoading;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(9,8);
		add(10,83,3);

	}
	
	static void add(int a,int b){
		System.out.println("a= "+a+" b= "+b);
	}
	
	static void add(int a,int b, int c) {
		System.out.println("a= "+a+" b= "+b+" c= "+c);
	}

}
