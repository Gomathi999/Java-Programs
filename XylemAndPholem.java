// 42. Xylem and pholem

package assignment;

import java.util.Scanner;

public class XylemAndPholem {

	// Defining a method to check whether the given number is xylem or not
	static void toCheckXylemOrPholem(int userInput,int lengthOfNumber) {
		int array[] = new int[lengthOfNumber];
		int ctr;
		int number = userInput;
		for( ctr=array.length-1; ctr>=0; ctr--) {
			while(userInput != 0) {				//34326!=0					3432!=0
				array[ctr] = userInput%10;		//array[4]=34326%10=6		array[3]=3432%10=2
				userInput /= 10;				//userInput=34326/10=3432	userInput=3432/10=343
				break;
			}	
		}
		// Printing the array for given user number
		System.out.println("The array of the given number is");
		for(int outputArray : array) {
			System.out.print(outputArray+" ");	// {3,4,3,2,6}
		}
		System.out.println();
		// Calculating outer sum
		int outerSum = array[0]+array[array.length-1];	
		System.out.println("outersum = "+outerSum);		//3+6=9
		// Calculating inner sum
		int innerSum=0;
		for(ctr=1; ctr<array.length-1; ctr++) {
			innerSum += array[ctr];
		}
		System.out.println("innersum = "+innerSum);		//4+3+2=9
		System.out.println(outerSum == innerSum ? number+" is xylem number" : number+" is pholem number");	//xylem number
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		// Getting a number from user
		System.out.println("Enter the number you want to check whether the given number is xylem or pholem number");
		int userInput  = scan.nextInt();	//34326
		// Calling a method to find length of given user number from length of number class
		int lengthOfNumber=LengthOfNumber.toFindLengthOfNumber(userInput);	//5
		// Calling a method for checking the number xylem or pholem
		toCheckXylemOrPholem(userInput,lengthOfNumber);	//34326,5
		scan.close();
	}
}
