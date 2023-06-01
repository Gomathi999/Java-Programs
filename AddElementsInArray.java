// 59. Accept the number from user and check that number is present when add two elements in an array

package assignment;

import java.util.Scanner;

public class AddElementsInArray {

	static void toAddTwoElements(int number,int getElement[]) {
		boolean flag = false;
		for(int ctr=0; ctr<getElement.length; ctr++){
			for(int ctr1=ctr+1; ctr1<getElement.length; ctr1++) {
				if(getElement[ctr]+getElement[ctr1] == number) {
					flag = true;
					System.out.println("Element found at the index "+ ctr + " and "+ctr1);
					break;
				}
			}
		}
		if(flag == false) {		
			System.out.println("Element not found");
		}
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scan.nextInt();
		System.out.println("Enter the elements in an array");
		int getElement[] = new int [size];
		GettingArray.toGetArrayElements(getElement,scan);
		System.out.println("Enter the number");
		int number = scan.nextInt();
		toAddTwoElements(number,getElement);
		scan.close();
	}
}
