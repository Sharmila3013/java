package edu.learning;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int myFirstNum = 120;
		
		int FirstStrike = (myFirstNum%3);
		int SecondStrike = (myFirstNum%5);
		int ThirdStrike = (myFirstNum%10);
		boolean DivBy3 = (FirstStrike == 0) ;
		boolean DivBy5 = (SecondStrike == 0);
		boolean DivBy10 = (ThirdStrike == 0);
		
		if(DivBy3 && DivBy5 && DivBy10)
		{
			System.out.println("3 Strike, Divisible by 3,5,10");
		}
		else if((DivBy3 && DivBy5)) 
		{
			System.out.println("2 Strike, Divisible by 3,5");
		}
		else if((DivBy5 && DivBy10)) 
		{
			System.out.println("2 Strike, Divisible by 5,10");
		}
		else if((DivBy3 && DivBy10)) 
		{
			System.out.println("2 Strike, Divisible by 3,10");
		}
		else if(DivBy3) 
		{
			System.out.println("1 Strike, Divisible by 3");
		}
		else if(DivBy5) 
		{
			System.out.println("1 Strike, Divisible by 5");
		}
		else if(DivBy10)
		{
			System.out.println("1 Strike, Divisible by 10");
		}
	}

}
