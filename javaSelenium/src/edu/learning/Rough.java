package edu.learning;

public class Rough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 0;
		int num2 = 25;
		Divisible(num1,num2);
	}
	public static void Divisible(int num1, int num2) {
		for (int i = 0; i <= num2; i++) {
			System.out.println("Divisible by 2 and 5");
			if ((num2 % 2 == 0) && (num2 % 5 == 0)) {
				System.out.println("i");
			}
		}
		for (int i = 0; i <= num2; i++) {
			System.out.println("Divisible by 2 and not by 5");
			if ((num2 % 2 == 0) && ((num2 % 5) != 0)) {
				System.out.println("i");
			}
		}

	}


}

}
