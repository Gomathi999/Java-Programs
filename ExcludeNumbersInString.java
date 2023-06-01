// 37. exclude numbers in a string and print only letters

package assignment;

import java.util.Scanner;

public class ExcludeNumbersInString {

	static void toOmitInteger(String userInput) {
		
		for(int ctr=0; ctr<userInput.length(); ctr++) {
			if(userInput.charAt(ctr) >= 48 && userInput.charAt(ctr) <= 57) {
			continue;	
			}
			System.out.print(userInput.charAt(ctr));
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sentence in which you want to omit the number");
		String userInput = scan.nextLine();
		toOmitInteger(userInput);
		scan.close();

	}

}
