package edu.learning;

public class PrimeNumber {

	public static void main(String[] args) {
//		int myNum = 21;
//		boolean isPrime = isPrime(myNum);
//		System.out.println(String.format("%s is prime - %s", myNum, isPrime));
		int count=0;
		for(int i=0;i<100; i++) {
			boolean isPrime = isPrime(myNum);
			if(isPrime) {
				if(count>=5) {
					break;
				}
				System.out.println(String.format("%s is prime - %s", myNum));
				count+=1;
			}
			
		}

	}

	public static boolean isPrime(int myNum) {
		boolean isPrime = true;
		if (myNum <=1) {
			isPrime=false;
			return isPrime;
		}
	
		
		for(int i=2; i<myNum/2; i++) {
			if(myNum % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

}
//
//int a=21;
//int result = a/2;
//print a;
