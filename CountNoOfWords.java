//35. Count no. of words in a sentence

package assignment;

import java.util.Scanner;

public class CountNoOfWords {

	static void toCountWords(String userInput) {
		int count=1;
		for(int ctr=0; ctr<userInput.length(); ctr++) {
			if((userInput.charAt(ctr) == ' ') && (userInput.charAt(ctr+1) != ' ')) {
				count++;
			}
		}
		System.out.println("No. of words in this sentence is :"+count);
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sentence you want to count the words");
		String userInput = scan.nextLine();
		toCountWords(userInput);
		scan.close();
	}
}
