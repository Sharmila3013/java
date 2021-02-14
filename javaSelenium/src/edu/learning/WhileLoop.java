package edu.learning;

public class WhileLoop {

	public static void main(String[] args) {
		While(5);

	}

	public static void While(int endNum) {
//		for (int i = 1; i <= endNum; i = i++) {
//			if (i < 3) {
//				continue;
//			}
//			System.out.println(i + ",");
//
//			if (i > 2) {
//				break;
//			}
//		}
//	

	int i = 1;
	while(i<5)
	{
		System.out.println("Before cntinue", + i);
	
		if (i < 3) {
			i++;
			continue;
		}
		System.out.println("After cntinue", + i);
		
		System.out.println(i + ",");
		i++;
		
		if (i > 4) {
			break;
		}
	}
	

//	int i = 5;do
//	{
//		System.out.println(i + ",");
//		i++;
//	}while(i<5);
//
//}

//break terminate loop
//return terminate iteration
