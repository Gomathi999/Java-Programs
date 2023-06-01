//12. print odd and even indexed values  separately from an array by accepting user input 

package assignment;

import java.util.Scanner;

public class PrintingOddEvenIndexedValue {
	
	// Defining a method to find even indexed values
	static void toCheckEvenIndexValue(int getElement[]) {
		for(int ctr=0; ctr<getElement.length; ctr=ctr+2) {
			System.out.print(getElement[ctr]+" ");
		}
		System.out.println();
	}
	
	// Defining a method to find odd indexed values
	static void toCheckOddIndexValue(int getElement[]) {
		for(int ctr=1; ctr<getElement.length; ctr=ctr+2) {
			System.out.print(getElement[ctr]+" ");
		}		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Getting size of an array from user
		System.out.println("Enter the size of an array :");
		int size = scan.nextInt();  ////5
		// Getting elements of an array from the user
		System.out.println("Enter the elements of an array :");
		int getElement[] = new int [size];   
		// To read array elements by calling toGetArrayElements method from GettingArray class
		GettingArray.toGetArrayElements(getElement,scan);
		// Calling a method for printing even indexed values
		System.out.println("The Even indexed values are");
		toCheckEvenIndexValue(getElement);
		// Calling a method for printing odd indexed values
		System.out.println("The Odd indexed values are");
		toCheckOddIndexValue(getElement);
		scan.close();
	}
}
