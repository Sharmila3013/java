package edu.learning;

public class GreatestOfThreeNumbers {

	public static void main(String[] args) {
		
		int myFirstNum = 66;
		int mySecNum = 122;
		int myThirdNum = 131;
		
		boolean result1 = myFirstNum > mySecNum ;
		boolean result2 = myFirstNum > myThirdNum;
		boolean result3 = mySecNum > myFirstNum;
		boolean result4 = mySecNum > myThirdNum;
		
		if (result1 && result2)
		{
	        System.out.println("myFirstNum is greater");
		}
		else if (result3 && result4)
			{
		        System.out.println("mySecNum is greater");
			}
		else 
		{
	        System.out.println("myThirdNum is greater");
		}

			
	}

}
