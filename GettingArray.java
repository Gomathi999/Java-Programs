package assignment;

import java.util.Scanner;

public class GettingArray {

	static void toGetArrayElements(int getElement[], Scanner scan) {
		int array;
		for(array=0; array<getElement.length; array++) {
			getElement[array] = scan.nextInt();
		}
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scan.nextInt();
		System.out.println("Enter the of elements in an array");
		int getElement[] = new int [size];
		toGetArrayElements(getElement,scan);
		scan.close();
	}
}
