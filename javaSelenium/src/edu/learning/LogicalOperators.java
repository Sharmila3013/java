package edu.learning;

public class LogicalOperators {

	public static void main(String[] args) {
	
		int myMathScore = 22;
		int mySciScore = 10;
		
		int mathplussci = myMathScore+mySciScore;
			
		boolean Distinction = ((myMathScore>80) && (mySciScore>80));
		
		if( Distinction || (mathplussci >= 160))
		{
			System.out.println("Distinction");			
		}
		
		else if ((mathplussci < 120) || (mathplussci < 35))
		{
			System.out.println("First Class");
		}
		
		else if (mathplussci < 160) || (mathplussci > 120)
		{
			System.out.println("Not Good");
		}

	}

}
