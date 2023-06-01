// 20.Palindrome Number or not

package assignment;

import java.util.Scanner;

public class PalindromeNumber {

	// Creating a method to find the reverse of the given number 
	static int toFindReverse(int number) {  // 435
		int reverseNumber=0;
		while(number>0) {
			int reminder = number%10;			//435%10 = 5   43%10 = 3   4%10=4
			number = number/10;					//435/10 = 43  43/10 = 4   4/10=0
			reverseNumber = (reverseNumber*10)+reminder; //5	   53	       534
		}
		return reverseNumber;	//534
	}

	// Creating a method to check the length of the given number 
	static void toCheckPalindrome(int userInput, int toCatchReverse ) {
		if(toCatchReverse == userInput) {		//534 == 435
			System.out.println(userInput+" is a Palindrome Number");
		}
		else {
			System.out.println(userInput+" is not a Palindrome Number");
		}	
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Getting a number from user
		System.out.println("Enter the number :");	//435
		int userInput = scan.nextInt();
		// Calling a method to perform reverse and catch the value then store in toCatchReverse variable
		int toCatchReverse = toFindReverse(userInput);	//534
		// Calling a method to check the given number is palindrome or not
		toCheckPalindrome(userInput,toCatchReverse);
		scan.close();
	}
}
