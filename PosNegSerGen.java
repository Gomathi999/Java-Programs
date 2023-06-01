//5. accept user input to check positive or negative number using loops by using prg1

package assignment;

import java.util.Scanner;

public class PosNegSerGen {
	
	void toGenerateSeries(int firstNumber,int secondNumber) {
		for(int number1=firstNumber; number1<=secondNumber; number1++) {
			numberZero.toCheckPositiveOrNegative(number1);	
		}
	} 

	public static void main(String[] args) {
		PosNegSerGen posinega = new PosNegSerGen();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number");
		int firstNumber=scan.nextInt();
		System.out.println("Enter the second number");
		int secondNumber=scan.nextInt();
		posinega.toGenerateSeries(firstNumber,secondNumber);
		scan.close();
	}


}
