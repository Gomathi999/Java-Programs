// 30. perform calculator prg with basic arithmetic operators

package assignment;

import java.util.Scanner;

public class Calculator {

	// Defining a method to perform arithmetic operation
	static void toCalculateArithmeticOperation(char operator,int userInput1,int userInput2){
		int output=0;
		switch(operator) {					//operator = +
		case '+':
			output=userInput1+userInput2;	//20+10=30
			break;
		case '-':
			output=userInput1-userInput2;	//20-10=10
			break;
		case '*':
			output=userInput1*userInput2;	//20*10=200
			break;
		case '/':
			output=userInput1/userInput2;	//20/10=2
			break;
		case '%':
			output=userInput1%userInput2;	//20%10=0
			break;
		default:
			System.out.println("please enter the valid operation!!");
		}
		System.out.println("The Output is :"+output);	//output=30
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose the operator you want to perform +, -, *, /, %");
		// Getting a character from user to perform certain operation
		char operator = scan.next().charAt(0);			//operator = +
		// Getting a number from user
		System.out.println("Enter the first number");	//20
		int userInput1 = scan.nextInt();
		System.out.println("Enter the second number");	//10
		int userInput2 = scan.nextInt();
		// Calling a method to perform arithmetic operation
		toCalculateArithmeticOperation(operator,userInput1,userInput2);
		scan.close();
	}
}
