package edu.learning;

public class EvenOrOdd {

	public static void main(String[] args) {
		myMethod1(20);

	}

	public static void myMethod1(int endRange) {
		int startNum=10;
		int endNum=20;
		String result="odd";
		myMethod1(startNum, endNum, result);
	}

	public static void myMethod1(int startRange, int endRange, String EvenOrOdd) {
		for (int i = startRange; i <= endRange; i++) {
			if (EvenOrOdd == "even") {
				if (i % 2 == 0) {
					System.out.println("even number is" + i);
					//System.out.println("Even");
				}
			} else if (i % 2 != 0) {
				System.out.println("odd number is" + i);
				//System.out.println("Odd");
			}

		}
	}

}
