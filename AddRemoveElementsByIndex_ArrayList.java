package assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AddRemoveElementsByIndex_ArrayList {

	static Scanner scan = new Scanner(System.in);

	static void toAddElements(List<Integer> elements) {
		System.out.println("\nEnter the no.of.elements you wanna add to arraylist: ");
		int count = scan.nextInt();
		System.out.println("Enter the index and value to be added: ");
		for (int ctr = 0; ctr < count; ctr++) {
			int index = scan.nextInt();
			int newValue = scan.nextInt();
			elements.add(index, newValue);
		}
		System.out.println("\n" + elements.size());
		System.out.println(elements);
	}

	static void toDeleteElements(List<Integer> elements) {
		System.out.println("\nEnter the no.of.elements you wanna delete from arraylist: ");
		int count1 = scan.nextInt();
		System.out.println("Enter the index to remove a specific element: ");
		for (int ctr = 0; ctr < count1; ctr++) {
			int value = scan.nextInt();
			if (count1 > 1 && ctr > 0) {
				if (value < elements.size()) {
					elements.remove(value - 1); // 1 7 6 (7-1)
				} 
				else {
					System.out.println("Invalid index!");
				}
			} 
			else {
				elements.remove(value); // 1 7 6 (7-1)
			}
		}

		System.out.println("\n" + elements.size());
		System.out.println(elements);
	}

	public static void main(String[] args) {
		List<Integer> elements = new ArrayList<>(Arrays.asList(24,2,32,41,11,81,14,76,57,9)); // Arrays.asList(24,2,32,41,11,81,14,76,57,9)
		//elements.add(7);
		System.out.println(elements.size());
		System.out.println(elements);
		toAddElements(elements);
		toDeleteElements(elements);
	}
}
