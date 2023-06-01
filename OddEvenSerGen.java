//6. accept user input to check even or odd number using loops by using prg2

package assignment;

import java.util.Scanner;

public class OddEvenSerGen {

		void toGenerateSeries(int firstNumber,int secondNumber) {
			for(int number1=firstNumber; number1<=secondNumber; number1++) {
				oddEven.toCheckOddOrEven(number1);	
			}
		} 

		public static void main(String[] args) {
			OddEvenSerGen oddeven = new OddEvenSerGen();
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the first number");
			int firstNumber=scan.nextInt();
			System.out.println("Enter the second number");
			int secondNumber=scan.nextInt();
			oddeven.toGenerateSeries(firstNumber,secondNumber);
			scan.close();

	}

}
