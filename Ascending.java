// 31.Ascending order

package assignment;

import java.util.Scanner;

public class Ascending {

	static void toAscending(int getElement[]) {
		for(int ctr=0; ctr<getElement.length; ctr++) {
			for(int ctr1=ctr+1; ctr1<getElement.length; ctr1++) {
				if(getElement[ctr] > getElement[ctr1]) {
					int temp = getElement[ctr];
					getElement[ctr] = getElement[ctr1];
					getElement[ctr1] = temp;
				}
			}
		}
		System.out.println("Ascending Order is");
		for(int  arrayElement : getElement) {
			System.out.print(arrayElement+" ");	
		}
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scan.nextInt();
		System.out.println("Enter the of elements in an array");
		int getElement[] = new int [size];
		GettingArray.toGetArrayElements(getElement, scan);
		toAscending(getElement);
		scan.close();
	}

}
