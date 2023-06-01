package assignment;

import java.util.Scanner;

public class RightRotation {
	
	// Defining a method to perform right rotation
	static void toRotateRight(int getElement[], int noOfRotation) {		//{1,2,3,4,5},1
		for(int ctr=1; ctr<=noOfRotation; ctr++) {
			int lastNumber=getElement[getElement.length-1];		//last number=5
			for(int ctr1=getElement.length-1; ctr1>0; ctr1--) {
				getElement[ctr1]=getElement[ctr1-1];	//getElement[4]=4
			}
			getElement[0] = lastNumber;		//getElement[0]=5
		}
		for(int output : getElement) {
			System.out.print(output+" ");	// {5,1,2,3,4}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Getting size of an array from user
		System.out.println("Enter the size of the element");
		int size = scan.nextInt();			//5
		// Getting elements of an array from the user 
		System.out.println("Enter the element of an array");
		int getElement[] = new int[size];
		// To read array elements by calling toGetArrayElements method from GettingArray class
		GettingArray.toGetArrayElements(getElement, scan);		// 1 2 3 4 5
		// Getting number of rotation from user to perform left rotation
		System.out.println("Enter the no. of rotation you want to rotate right");	//1
		int noOfRotation = scan.nextInt();
		// Calling a method to rotate right
		toRotateRight(getElement,noOfRotation);		//{1,2,3,4,5},1
		scan.close();
	}
}
