//15.Amstrong Number or not

package assignment;

import java.util.Scanner;

public class AmstrongNumber {
	
	// Creating a method perform amstrong number 
	static int amstrongNumber(int userInput) {
		int sum=0;
		// Check whether the user input is greater than 0 and doing amstrong number operation 
		while(userInput>0) {
			int number=userInput%10;
			sum=sum+(number*number*number);
			userInput=userInput/10;
		}
		// Return the value sum and assign it to toCatchSum variable
		return sum;
	}
	
	// Creating a method to check the given number is amstrong or not
	static void toCheckAmstrongOrNot(int userInput, int toCatchSum) {
		if(userInput==toCatchSum) {
			System.out.println(userInput+" is an Amstrong Number");
		}
		else {
			System.out.println(userInput+" is not an Amstrong Number");
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Getting a number from user
		System.out.println("Enter the user input:");
		int userInput = scan.nextInt();
		// Calling a method perform amstrong number and catch the value then store in toCatchSum variable
		int toCatchSum=amstrongNumber(userInput);
		// Calling a method to check the given number is amstrong or not
		toCheckAmstrongOrNot(userInput,toCatchSum);
		scan.close();
	}
}
