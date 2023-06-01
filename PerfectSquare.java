// 22. Find a number is perfect square or not and display the square root

package assignment;

import java.util.Scanner;

public class PerfectSquare {

	// Creating a method to find the given number is perfect square or not
	static boolean toFindPerfectSquare(int userInput) {
		boolean flag = false; //flag is declared to used to find whether the user input is enter into the loop or not
		int number;
		for(number=1; number<=userInput; number++) {
			if(number*number == userInput) {
				flag = true;
				System.out.println(userInput+" is a perfect square");
				System.out.println("The square root of "+userInput+" is "+number);
				break;
			}
		}
		if(flag == false) {
			System.out.println(userInput+" is not a perfect square");
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Getting a number from user
		System.out.println("Enter the number you want to find perfect square");
		int userInput = scan.nextInt();
		// Calling a method to check the given number is perfect square or not
		toFindPerfectSquare(userInput);
		scan.close();
	}

}
