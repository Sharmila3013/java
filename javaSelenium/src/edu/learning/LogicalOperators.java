package edu.learning;

public class LogicalOperators {

	public static void main(String[] args) {
	
		int myMathScore = 92;
		int mySciScore = 22;
		
		int mathplussci = myMathScore + mySciScore;
		System.out.println("Maths + Science score = " + mathplussci);	
		
		boolean Distinction = (((myMathScore>=80) && (mySciScore>=80)) || (mathplussci >= 160));
		boolean FirstClass = ((mathplussci < 120) || (mathplussci > 35)); 
		boolean NotGood = ((myMathScore<35) && (mySciScore<35));
		
		if( Distinction == true)
		{
			System.out.println("Distinction");			
		}
		
		else if (FirstClass == true)
		{
			System.out.println("First Class");
		}
		
		else if (NotGood == true)
		{
			System.out.println("Not Good");
		}

	}

}
