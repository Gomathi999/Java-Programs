// 4b. accept user input to generate series using while loop

package assignment;

import java.util.Scanner;

public class SeriesGeneration2 {

	static void toGenerateSeries(int firstNumber,int secondNumber) {
		int number1=firstNumber;
		while(number1<=secondNumber) {
			System.out.print(number1+" ");
			number1++;
		}
	} 

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int firstNumber=scan.nextInt();
		System.out.println("Enter the second number");
		int secondNumber=scan.nextInt();
		toGenerateSeries(firstNumber,secondNumber);
		scan.close();
	}
}
