//25. accept user month and calculate the no.of days from that month to end of the month in that year 

package assignment;

import java.util.Scanner;

public class CalculateNoOfdays {

	// Creating a method to calculate the remaining number of days in this year
	static void toCalculateNoOfDays(int userYear,int month){
		int noOfDays=0;
		switch(month) {
			case 1:
				noOfDays+=31;
			case 2:
				boolean toCatchFlag = LeapYear.toCheckLeapYear(userYear);
				if(toCatchFlag == true) {
				noOfDays+=28;
				}
				else {
				noOfDays+=29;
				}
			case 3:
				noOfDays+=31;
			case 4:
				noOfDays+=30;
			case 5:
				noOfDays+=31;
			case 6:
				noOfDays+=30;
			case 7:
				noOfDays+=31;
			case 8:
				noOfDays+=31;
			case 9:
				noOfDays+=30;
			case 10:
				noOfDays+=31;
			case 11:
				noOfDays+=30;
			case 12:
				noOfDays+=31;
				break;
			default:
				System.out.println("Enter the valid month");
		}
		System.out.println("No. of remaining days in this year = "+noOfDays);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Getting a year from user
		System.out.println("Enter the year");
		int userYear = scan.nextInt();
		// Getting a month from user
		System.out.println("Enter the month");
		int month = scan.nextInt();
		// Calling a method to calculate no. of days
		toCalculateNoOfDays(month,userYear);
		scan.close();
	}

}
