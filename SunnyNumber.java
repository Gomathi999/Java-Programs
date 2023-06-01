// 34.Sunny Number---> if the next value of input number is a perfect square of any number
					   	
package assignment;

import java.util.Scanner;

public class SunnyNumber {

	static void toCheckSunnyNumber(boolean toCatchFlagValue,int number) {
		if(toCatchFlagValue == true) {
			System.out.println(number+" is a sunny number");
		}
		else {
			System.out.println(number+" is not a sunny number");
		}
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number you want to check");
		int userInput=scan.nextInt();
		boolean toCatchFlagValue =PerfectSquare.toFindPerfectSquare(userInput+1);
		toCheckSunnyNumber(toCatchFlagValue,userInput);
		scan.close();
	}
}
