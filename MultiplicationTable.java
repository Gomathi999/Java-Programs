// 14. multiplication table by accepting multiplier and limit from user

package assignment;

import java.util.Scanner;

public class MultiplicationTable {
	
	// Create a method to get multiplication table
	static void multiplicationTable(int mulTable, int limit) {
		int userTable, number;
		for(number=1; number<=limit; number++) {
			userTable=number*mulTable;
			System.out.println(number+"*"+mulTable+"="+userTable);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Getting an input from user
		System.out.println("Enter the Multiplication table you want :");
		int mulTable = scan.nextInt();
		// Getting limit from user
		System.out.println("Enter the Multiplicant limit of the table :");
		int limit = scan.nextInt();
		System.out.println(mulTable+"th Table");
		// Calling a method to perform multiplication
		multiplicationTable(mulTable,limit);
		scan.close();
	}

}
