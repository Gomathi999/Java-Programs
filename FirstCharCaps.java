package assignment;

import java.util.Scanner;

public class FirstCharCaps {

	static void toConvertFirstCharCaps(String line) {
		int firstChar = line.charAt(0);
		if(firstChar>=97 && firstChar<=122) {
			System.out.print((char) (firstChar-32));
		}
		else {
			System.out.print((char)(firstChar));
		}
		for(int ctr=1; ctr<line.length(); ctr++) {
			char letter = line.charAt(ctr);
			if(letter == ' ') {
				int ascii = line.charAt(ctr+1);
				if(ascii>=97 && ascii<=122) {
					System.out.print(" " + (char) (ascii-32));
					ctr+=1;
				}
				else {
					System.out.print((char) (letter));
				}
			}
			else {
				System.out.print(letter);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String line = scan.nextLine();
		toConvertFirstCharCaps(line);
		scan.close();
	}
}
