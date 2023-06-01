//16.Krishnamurthy Number or Not

package assignment;

import java.util.Scanner;

public class KrishnamurthyNumber {
	
	// Creating a method perform Krishnamurthy number 
	static int toPerformKmNumber(int userInput) {
		int sum=0;
		// Check whether the user input is greater than 0 and doing Krishnamurthy number operation 
		while(userInput>0) {
			int number=userInput%10;
			int toCatchFact=Factorial.toCalculateFactorial(number);
			sum=sum+toCatchFact;
			userInput=userInput/10;
		}
		// Return the value sum and assign it to toCatchSum variable
		return sum;
	}
	
	// Creating a method to check the given Krishnamurthy number is  or not
	static void toCheckKmOrNot(int userInput, int toCatchSum) {
		if(userInput==toCatchSum) {
			System.out.println(userInput+" is a Krishnamurthy Number");
		}
		else {
			System.out.println(userInput+" is not a Krishnamurthy Number");
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Getting a number from user
		System.out.println("Enter the user input:");
		int userInput = scan.nextInt();
		// Calling a method perform Krishnamurthy number and catch the value then store in toCatchSum variable
		int toCatchSum=toPerformKmNumber(userInput);
		// Calling a method to check the given number is Krishnamurthy or not
		toCheckKmOrNot(userInput,toCatchSum);
		scan.close();
	}
}
