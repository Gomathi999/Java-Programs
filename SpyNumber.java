// 24. Spy number---> Sum of all digits = product of all digits

package assignment;

import java.util.Scanner;

public class SpyNumber {

	// Creating a method to find the given number is spy number or not
	static void toCheckSpyNumber(int number) {
		int sum=0;
		int product=1;
		while (number>0) {  				//123
			int reminder = number%10;		//123%10=3		12%10=2		1%10=1
			sum = sum+reminder;				//0+3=3			3+2=5		5+1=6
			product = product*reminder;		//1*3=3			3*2=6  		6*1=6
			number = number/10;				//123/10=12		12/10=1		1/10=0
		}
		System.out.println(sum == product? "Spy number" : "Not spy number");  //6 == 6
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Getting a number from user
		System.out.println("Enter the number");
		int userInput = scan.nextInt();
		// Calling a method to check the given number is spy number or not
		toCheckSpyNumber(userInput);
		scan.close();
	}
}
