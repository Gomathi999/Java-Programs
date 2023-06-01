// 39. Neon number

package assignment;

import java.util.Scanner;

public class NeonNumber {
	
	// Defining a method to check whether the given number is neon number or not
	static void toCheckNeonNumber(int number) {		//9
		int sum=0;
		int square = number*number;					//square=9*9=81	
		while(square>0) {							//81>0
			sum+=square%10;							//sum=0+(81%10)=0+1=1
			square/=10;								//square=81/10=8
		}
		System.out.println(number==sum? number+" is neon number" : number+" is not neon number");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Getting a number from user
		System.out.println("Enter the number you want to check neon number or not");
		int userInput = scan.nextInt();
		// Calling a method for checking the number is neon number or not
		toCheckNeonNumber(userInput);
		scan.close();
	}
}