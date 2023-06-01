package assignment;

import java.util.Scanner;

public class Anagram {

	public static void toFindAnagram(String word, String word1) {
		char[] letters = word.toCharArray() ;
		boolean flag=false;
		for(char letter:letters) {
			int value = word1.indexOf(letter); //-1 k
			//vinothini //vinothiii
			if(value != -1) {
				String change =String.valueOf(word1.charAt(value));  
				word1 = word1.replaceFirst(change,"#");
				//word1 = word1.replace(word1.charAt(value),'#');
				//System.out.println(word1);
			}
			else {
				flag=true;
				System.out.println("not an anagaram");
				break;
			}
		}
		if(flag==false) 
			System.out.println("Anagram");  
	}

	public static void main(String args[]){
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter the string: ");
		String word = scan.next();
		System.out.print("Enter the string to check anagram or not: ");
		String word1 = scan.next();

		if(word.length()== word1.length()) {
			toFindAnagram(word.toLowerCase(),word1.toLowerCase());
		}
		else {
			System.out.println("To check for anagram, string length should be equal");
		}
		scan.close();
	}
}
