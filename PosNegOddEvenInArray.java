//11. check positive/negative and odd/even in an array by using existing methods, accept user input

package assignment;

import java.util.Scanner;

public class PosNegOddEvenInArray {

	// Create a method to check the number is positive or negative and odd or even in an array
	static void toCheckNumber(int numbers[], Scanner scan) {
		for(int arr=0; arr<numbers.length; arr++) {
			numbers[arr]=scan.nextInt();
			// Calling a method from numberZero class
			numberZero.toCheckPositiveOrNegative(numbers[arr]);
			// Calling a method from oddEven class 
			oddEven.toCheckOddOrEven(numbers[arr]);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Getting size of an array from user
		System.out.println("Enter the size of an array :");
		int size = scan.nextInt();
		// Getting elements of an array from the user
		int numbers[] = new int [size];
		System.out.println("Enter the elements of an array :");
		// Calling a method for to check the number is positive or negative and odd or even in an array
		toCheckNumber(numbers,scan);
		scan.close();

	}

}
