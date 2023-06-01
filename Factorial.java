// 13. factorial of user input number

package assignment;

import java.util.Scanner;

public class Factorial {

	// Creating a method for calculating factorial
	static int toCalculateFactorial(int userInput) {
		int fact=1;
		for(int number=1; number<=userInput; number++) {
			fact=fact*number;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Getting an input from user
		System.out.println("Enter the number to perform factorial :");
		int userInput = scan.nextInt();
		// Calling a method to perform factorial and catch the value then store in toCatchFact variable
		int toCatchFact=toCalculateFactorial(userInput);
		System.out.println("Factorial number of "+userInput+" is "+toCatchFact);
		scan.close();
	}

}
