// 38. Leap year

package assignment;

import java.util.Scanner;

public class LeapYear {
	
	// Defining a method to check the given year is leap year or not
	static boolean toCheckLeapYear(int year) {
		boolean flag = false;
		if(((year%4 == 0) && (year%100 != 0)) || (year%400 == 0)) {
			flag = true;
			System.out.println(year+" is a leap year");
		}
		else if(flag==false) {
			System.out.println(year+" is not a leap year");
		}	
		return flag;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// To get a year from user
		System.out.println("Enter the year you want to check whether the given year is leap year or not");
		int userYear = scan.nextInt();
		// Calling a method to check leap year
		boolean toCatchFlag = toCheckLeapYear(userYear);
		scan.close();
	}
}
