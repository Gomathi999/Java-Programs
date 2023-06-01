//4a. accept user input to generate series using for loop

package assignment;

import java.util.Scanner;

public class SeriesGeneration {

	static void toGenerateSeries(int firstNumber,int secondNumber) {
		for(int number1=firstNumber; number1<=secondNumber; number1++) {
			System.out.print(number1+" ");
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
