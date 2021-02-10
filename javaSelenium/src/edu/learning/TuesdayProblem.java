package edu.learning;

public class TuesdayProblem {

	public static void main(String[] args) {
		
		int myFirstNum = 33;
		
		int FirstStrike = (myFirstNum%3);
		int SecondStrike = (myFirstNum%5);
		int ThirdStrike = (myFirstNum%10);
		
		boolean Strike1 = ((FirstStrike == 0) && (SecondStrike == 0) && (ThirdStrike == 0));
		boolean Strike2 = (((FirstStrike == 0) && (SecondStrike == 0)) 
				|| ((SecondStrike == 0) && (ThirdStrike == 0))
				|| ((FirstStrike ==0) && (ThirdStrike == 0)));
		boolean Strike3 = ((FirstStrike == 0) || (SecondStrike == 0) || (ThirdStrike == 0));
				
		if(Strike1 == true)
		{
		System.out.println("Divisible by all 3 nos");
		}
		else if (Strike2 == true)
		{
		System.out.println("Divisible by 2 nos");
		}
		else if (Strike3 == true)
		{
		System.out.println("Divisible by 1 no");
		}
		else 
		{
			System.out.println("Not divisible by 3,5,10");
		}

		
	}

}
