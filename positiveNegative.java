//1. accept user input and check if it is positive or negative by using user defined method

package assignment;

import java.util.Scanner;

public class positiveNegative {

	static void toCheckPositiveOrNegative(int number){
		if(number>0) {
			System.out.println("It is a Positive Number");
		}
		else {
			System.out.println("It is a Negative Number");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = scan.nextInt();
		toCheckPositiveOrNegative(number);
		scan.close();

	}

}
