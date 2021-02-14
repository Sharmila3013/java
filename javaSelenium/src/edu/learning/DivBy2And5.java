package edu.learning;

public class DivBy2And5 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 25;
		Divisible(num1, num2);
	}

	public static void Divisible(int startNum, int endNum) {
		for (int i = 0; i <= endNum; i++) {
			System.out.println("Divisible by 2 and 5");
			if ((endNum % 2 == 0) && (endNum % 5 == 0)) {
				System.out.println("i");
			}
		}
		for (int i = 0; i <= endNum; i++) {
			System.out.println("Divisible by 2 and not by 5");
			if ((endNum % 2 == 0) && ((endNum % 5) != 0)) {
				System.out.println("i");
			}
		}

	}
}
