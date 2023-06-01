// 19. Find the length of the given number

package assignment;

import java.util.Scanner;

public class LengthOfNumber {

	// Creating a method to find the length of the given number 
	static int toFindLengthOfNumber(int userInput) {
		int count=0; 
		while(userInput>0) {         //456			45			4
			count=count+1;			 //0+1=1		1+1=2		2+1=3
			userInput=userInput/10;	 //456/10=45	45/10=4		4/10=0
		}
		//System.out.println("The length of the given number is "+count);	//3
		return count;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Getting a number from user	
		System.out.println("Enter the number :");	//456
		int userInput = scan.nextInt();
		// Calling a method to find the length of the given number
		toFindLengthOfNumber(userInput);
		scan.close();
	}

}
