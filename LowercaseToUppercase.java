// 53. convert the string lowercase into uppercase

package assignment;

import java.util.Scanner;

public class LowercaseToUppercase {
	
	static void toConvertLowercaseToUppercase(String word) {
		for(int ctr=0; ctr<word.length(); ctr++) {
			char character = word.charAt(ctr);
			int ascii = character;
			if(ascii>=65 && ascii<=90) {
				System.out.print(character);
			}
			else if(ascii==32) {
				System.out.print(" ");
			}
			else{
				System.out.print((char)(ascii-32));
			}	
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the word you want to convert lowercase into uppercase");
		String userInput = scan.nextLine();
		toConvertLowercaseToUppercase(userInput);
		scan.close();
	}
}
