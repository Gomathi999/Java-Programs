// 29. accept user input and search the element in array(linear search)

package assignment;

import java.util.Scanner;

public class LinearSearch {

	// Defining a method for searching element in array
	static void toSearchElement(int getElement[],int element) {
		boolean flag=false;
		for(int ctr=0; ctr<getElement.length; ctr++) {
			if(element == getElement[ctr]) {
				flag=true;
				System.out.println("Element found and the index of the element is "+ctr);
				break;
			}
		}
		if(flag==false) {
			System.out.println("Element not found in an array");
		}
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		// Getting size of an array from user
		System.out.println("Enter the size of an array");
		int size = scan.nextInt();
		// Getting elements of an array from the user
		System.out.println("Enter the elements of an array");
		int getElement[] = new int [size];
		// To read array elements by calling toGetArrayElements method from GettingArray class
		GettingArray.toGetArrayElements(getElement,scan);
		// To get an element from user to search in an array
		System.out.println("Enter the element you want to search in an array");
		int element = scan.nextInt();
		// Calling a method for searching the element
		toSearchElement(getElement,element);
	}
}
