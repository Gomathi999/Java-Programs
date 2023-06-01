// 21. Buzz number

package assignment;

import java.util.Scanner;

public class BuzzNumber {
	
	// Creating a method to check the given number is Buzz number or not
	static void toCheckBuzzNumber(int number) {
		if((number%7 == 0) || (number%10 == 7)) {  
			System.out.println(number +" is a Buzz number");
		}
		else {
			System.out.println(number +" is not a Buzz number");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Getting a number from user
		System.out.println("Enter the number :");
		int userInput = scan.nextInt();
		// Calling a method to check the given number is Buzz number or not
		toCheckBuzzNumber(userInput);
		scan.close();
	}

}
