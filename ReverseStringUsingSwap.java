// 28. reverse a string by using swap method

package assignment;

import java.util.Scanner;

public class ReverseStringUsingSwap {
	
	// Defining a method for reverse a string 
	static void toReverseString(String userInput) {	//work
		char array[] =userInput.toCharArray();  	//{'w','o','r','k'}
		for(int leftCtr=0,rightCtr=array.length-1; leftCtr<=rightCtr; leftCtr++,rightCtr--) {  
			char temp = array[leftCtr];    			//temp=w		temp=o
			array[leftCtr] = array[rightCtr];		//array[0]=k	array[1]=r
			array[rightCtr] = temp;					//array[3]=w	array[2]=o
		}
		for(char output : array) {
			System.out.print(output);				//krow
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Getting a string from user
		System.out.println("Enter the word");
		String userInput = scan.nextLine();
		// Calling a method to perform reverse a string
		toReverseString(userInput);
		scan.close();
	}
}
