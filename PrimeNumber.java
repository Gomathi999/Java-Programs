// 18. write a program for Prime Number

package assignment;

import java.util.Scanner;

public class PrimeNumber {

	// Create a method to check the given number is prime or not 
	static boolean toCheckPrimeOrNot(int userInput) {
		boolean flag = false;
		for(int num=2; num<userInput; num++) {
			if(userInput%num == 0) {
				flag = true;
				break;
			}
		}
		if(flag == false) {
			System.out.println(userInput+" is prime");
		}
		else {
			System.out.println(userInput+" is non prime");
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Getting a number from user
		System.out.println("Enter the user input:");
		int userInput = scan.nextInt();
		// Calling method to check the given number is prime or not
		toCheckPrimeOrNot(userInput);
		scan.close();
	}
}
