package assignment;

import java.util.Scanner;

public class CharacterPatternProgram {

	public static void toPrintPattern(int number,char letter){
		int ascii = letter;
		for(int ctr=1;ctr<=number;ctr++) {               //1  2
			for(int ctr1=number;ctr1>=ctr;ctr1--) {      //5>=1  4>=1
				System.out.print((char) ascii + " ");    //a  b
			}
			if(ascii == 90 || ascii == 122) {
				ascii -= 26;//acsii = ascii - 26;
			}
			ascii++;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=scan.nextInt();
		System.out.println("Enter the character:");
		char letter=scan.next().charAt(0);
		toPrintPattern(number,letter);
		scan.close();
	}
}
