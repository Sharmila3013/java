package edu.learning;

public class SwitchClass {

	public static void main(String[] args) {
		String month ="Jan";
		int noOfDays = SwitchTrial(month);
		System.out.println(String.format("%s has %s days", month, noOfDays);

	}

	public static void Months(String Month) {
		int days = 0;
//		int, byte, short, char, string

		switch (Month) {
		case "Jan":
		case "Mar":
			days = 31;
			break;
		case "Feb":
			days = 28;
			break;
		case "Apr":
			days = 30;
		default:
			days = -1;
			break;
		}

	}return days;
}
