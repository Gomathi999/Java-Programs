// 27. String palindrome or not

package assignment;

import java.util.Scanner;

public class StringPalindrome {

	static String toReverseString(String word) {
		String reverse=" ";
		for(int ctr=word.length()-1; ctr>=0; ctr--) {
			reverse = reverse+word.charAt(ctr);
		}
		System.out.println("The reverse of  the word is"+reverse);
		return reverse;
	}

	static void toCheckPalindrome(String userInput,String toCatchWord) {
		if(userInput.equals(toCatchWord)) {
			System.out.println(userInput+" is a palindrome");
		}
		else {
			System.out.println(userInput+" is not a palindrome");
		}
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word");
		String userInput = scan.next();
		String toCatchWord = toReverseString(userInput);
		toCheckPalindrome(userInput,toCatchWord);
		scan.close();
	}

}
