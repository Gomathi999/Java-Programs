package assignment;

import java.util.Scanner;

public class CharactersDivideEqually {
	
	static void toCheckSentenceEquallyDivideOrNot(String line,int num) {
		if(line.length()%num == 0) {
			toDivideEqually(line,num);	
		}
		else {
			System.out.println("The length of the sentence can't divided into equally");
		}
	}
	
	static void toDivideEqually(String line, int num) {
		for(int ctr=0; ctr<line.length(); ctr+=num) {
			toPrintCharacters(line,ctr,num);
			System.out.println();
		}
	}

	static void toPrintCharacters(String line,int ctr,int num) {
		for(int ctr1=0; ctr1<num; ctr1++, ctr++) {
			System.out.print(line.charAt(ctr));
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String line = scan.nextLine();
		System.out.println("Enter the number you want to equally divide the characters :");
		int num = scan.nextInt();
		toCheckSentenceEquallyDivideOrNot(line,num);
		
		scan.close();
	}
}
