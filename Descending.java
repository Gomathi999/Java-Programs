// 32.Descending order

package assignment;

import java.util.Scanner;

public class Descending {

	static void toDescending(int getElement[]) {
		for(int ctr=0; ctr<getElement.length; ctr++) {
			for(int ctr1=ctr+1; ctr1<getElement.length; ctr1++) {
				if(getElement[ctr] < getElement[ctr1]) {
					int temp = getElement[ctr];
					getElement[ctr] = getElement[ctr1];
					getElement[ctr1] = temp;
				}
			}
		}
		System.out.println("Descending Order is");
		for(int ctr=0; ctr<getElement.length; ctr++) {
			System.out.print(getElement[ctr]+" ");	
		}
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scan.nextInt();
		System.out.println("Enter the of elements in an array");
		int getElement[] = new int [size];
		GettingArray.toGetArrayElements(getElement, scan);
		toDescending(getElement);
		scan.close();
	}
}
