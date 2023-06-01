//7. accept user input and generate even series only by using loops without if condition

package assignment;

import java.util.Scanner;

public class EvenSerGen {
	
	static void toGenerateEvenSeries(int number) {
		for(int num=0; num<=number; num=num+2) {
			System.out.print(num+" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scan.nextInt();
		toGenerateEvenSeries(number);
		scan.close();
	}
}
