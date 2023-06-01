// Count Vowels, consonants and whitespace

package assignment;

import java.util.Scanner;

public class VowelsAndConsonants {

	static void toCount(String line) {
		int vowel=0, consonant=0, whitespace=0;
		for(int ctr=0; ctr<line.length(); ctr++) {
			if(line.charAt(ctr) == 'a'|| line.charAt(ctr) == 'e' || line.charAt(ctr) == 'i' || line.charAt(ctr) == 'o' || line.charAt(ctr) == 'u'){
				vowel++;
			}
			else if(line.charAt(ctr) == ' ') {
				whitespace++;	
			}
			else {
				consonant++;
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
