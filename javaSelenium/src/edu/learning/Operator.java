package edu.learning;

public class Operator {

	public static void main(String[] args) {
	
		int myFirstNum = 2147483647;
		//double mySecondNum = 4.25;
		 int result = myFirstNum +1;
		 int result2= result -2;
		 System.out.println(result);
		 System.out.println(result2);
		 
		 float decimal1,decimal2;
		 decimal1 = 7.48f;
		 decimal2 = 8.88f;
		 System.out.println("the value is "+(decimal1+decimal2));
		 
		 double decimal3,decimal4;
		 decimal3 = 7.48;
		 decimal4 = 8.88;
		 System.out.println("the value is "+(decimal3+decimal4));
		//double total = myFirstNum + mySecondNum;
		
		//System.out.println(" 1 + 4 = 5" +  total);

		//System.out.println(" 1 + 4 = 5.25d" +  (total + 0.25d));
		
		//System.out.println(result);
		//System.out.println(result2);
	
	//int -> 2 power 31 -> -2147483648 to 2147483647
    //long->2 power 63 -> -9223372036854775808 to 9223372036854775807
	//short -> 2 power 8
	//float -> 16 digits after decimal point
	//double -> more digits will be stored after decimal point
		
	}

}
