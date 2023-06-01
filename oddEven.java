//2. user input and check if it is even or odd by using user defined method

package assignment;

import java.util.Scanner;

public class oddEven {
	
	static void toCheckOddOrEven(int num) {
		
		if(num%2==0) {
		    System.out.println(num+" is an Even Number");	
		}
		else {
			System.out.println(num+" is an Odd Number");
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scan.nextInt();
		toCheckOddOrEven(num);
		scan.close();
		}

}
