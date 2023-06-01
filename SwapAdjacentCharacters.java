//36. swap adjacent characters in a string

package assignment;

import java.util.Scanner;

public class SwapAdjacentCharacters {

	static void toSwapAdjacentCharacters(String userInput) {
		char array[] =userInput.toCharArray();
		for(int ctr=0; ctr<userInput.length()-1; ctr+=2) {
			char temp = array[ctr];	//
			array[ctr] = array[ctr+1];	//ogamht iv
			array[ctr+1] = temp;	
		}
		for(char input : array) {
			System.out.print(input);
		}
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word");
		String userInput = scan.nextLine();
		toSwapAdjacentCharacters(userInput);
		scan.close();
	}
}
