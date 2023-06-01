// 17. Find a factors of a given number

package assignment;

import java.util.Scanner;

	public class FactorsOfNumber {
		
	// Creating a method to find the factors of the given number and count the number of factors for that number
	static void toFindFactor(int userInput) {
		int num; int count = 1;
		for(num=2; num<=userInput; num++) {
			if(userInput%num == 0) {
				count = count+1;
				System.out.print(num+" ");	
				}
			}
		System.out.println();
		System.out.println("Count of the factors :"+count);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Getting a number from user
		System.out.println("Enter the user input:");
		int userInput = scan.nextInt();
		System.out.print("Factors of "+userInput+" are 1 ");
		// Calling a method to find the factors of the given number 
		toFindFactor(userInput);
		scan.close();
	}
}
