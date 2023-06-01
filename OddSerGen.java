//8. accept user input and generate odd series only by using loops without if condition

package assignment;

import java.util.Scanner;

public class OddSerGen {

	static void toGenerateOddSeries(int number) {
		int num=1;
		while(num<=number) {
			System.out.print(num+" ");
			num=num+2;
			}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int number=scan.nextInt();
		toGenerateOddSeries(number);
		scan.close();
	}

}
