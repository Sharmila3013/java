package edu.learning;

public class Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myNum1 = -2147483647;
		
		
		//int intOrLong = ((-2147483648<<myNum1)||(myNum1>>2147483647));
		
		if((myNum1 <=2147483647)||(myNum1>=-2147483648))
		{
			System.out.println(myNum1 + "is an integer");
		}
		
		else 
		{
			System.out.println(myNum1+ "is long");
		}
			
	}

}
