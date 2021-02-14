package edu.learning;

public class method {

	public static void main(String[] args) {
		
		myFirstMethod();
		myFirstMethodWithParameter("Sharmila");

	}
	
	public static void myFirstMethod() {
		
		System.out.println("my first method");
		
	}
	
    public static void myFirstMethodWithParameter(String myName) {
		
		System.out.println("hello" + myName);
		myFirstMethod();
		
	}


}
