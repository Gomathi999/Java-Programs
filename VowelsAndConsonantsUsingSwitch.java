// Count Vowels, consonants and whitespace using switch

package assignment;

import java.util.Scanner;

public class VowelsAndConsonantsUsingSwitch {

	static void toCount(String line) {
		int vowel=0, consonant=0, whitespace=0;
		for(int ctr=0; ctr<line.length(); ctr++) {
			switch(line.charAt(ctr)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowel++;
				break;
			case ' ':
				whitespace++;
				break;
			default:
				consonant++;
				break;
			}
		}
		System.out.println("Vowels ="+vowel);
		System.out.println("Consonants ="+consonant);
		System.out.println("Whitespace ="+whitespace);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the statement you want to count vowels, consonants and white space");
		String line = scan.nextLine();
		line = line.toLowerCase();
		toCount(line);
		scan.close();
	}
}


