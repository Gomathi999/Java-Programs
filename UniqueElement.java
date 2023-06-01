// 58. print unique element in an array using map

package assignment;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueElement {

	static void toPrintUniqueElement(int getElement[]) {
		Set<Integer> countChar = new HashSet<Integer>();
		for(int ctr=0; ctr<getElement.length; ctr++) {

		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = scan.nextInt();
		System.out.println("Enter the elements in an array");
		int getElement[] = new int [size];
		GettingArray.toGetArrayElements(getElement,scan);
		toPrintUniqueElement(getElement);
		scan.close();
	}
}
