//10. calculate sum and average of an array by accepting user input using user defined methods

package assignment;

import java.util.Scanner;

public class SumAverage {
	static int sum=0; static float avg;
	// Create a method for calculate sum 
	static void toCalculateSum(byte noOfSub, byte stdMarks[],Scanner scan) {
		for(byte arr=0; arr<noOfSub; arr++) {
			stdMarks[arr]=scan.nextByte();
			sum=sum+stdMarks[arr];	
		}
	} 
	// Create a method for display the value of sum and average
	static void toDisplayAndCalculateAverage(int sum, float avg, byte noOfSub) {
		System.out.println("Sum of the student marks :"+sum);
		avg=(float)sum/noOfSub;
		System.out.println("Average of the student marks :"+avg);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Getting number of subjects from user
		System.out.println("Enter the number of subjects student have :");
		byte noOfSub = scan.nextByte();
		// Getting marks of the student from the user
		byte stdMarks[] = new byte [noOfSub];
		System.out.println("Enter the Marks of the student :");
		// Calling method for to calculate sum 
		toCalculateSum(noOfSub,stdMarks,scan);
		// Calling method for to display the sum of marks and to calculate average of marks of a student
		toDisplayAndCalculateAverage(sum,avg,noOfSub);
		scan.close();
	}
}
