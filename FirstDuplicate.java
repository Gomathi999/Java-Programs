// 23. Find the first occur of a duplicate value in an array

package assignment;

import java.util.Scanner;

public class FirstDuplicate {

	static void toFindFirstOccurDuplicate(int getElement[]) {
		boolean flag = false;
		for(int ctr=0; ctr<getElement.length; ctr++) {
			for(int ctr1=ctr+1; ctr1<getElement.length; ctr1++) {
				if(getElement[ctr] == getElement[ctr1]) {
					flag=true;
					System.out.println("The first occurance of a duplicate value in an array is "+getElement[ctr]+" and the index is "+ctr);
					break;
				}
			}
		}
		if (flag == false) {
			System.out.println("Duplicate not found in an array");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scan.nextInt();
		System.out.println("Enter the elements of an array");
		int getElement[] = new int [size];
		GettingArray.toGetArrayElements(getElement,scan);
		toFindFirstOccurDuplicate(getElement);
		scan.close();
	}

}
