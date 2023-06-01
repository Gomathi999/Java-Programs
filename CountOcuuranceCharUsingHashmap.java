// 52. Accept a sentence from user and count the occurance of character using collections 

package assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOcuuranceCharUsingHashmap {

	static void toCountOccurance(String line) {
		Map<Character,Integer> countChar = new HashMap<Character,Integer>();
		int count;
		for(int ctr=0; ctr<line.length(); ctr++) {
			count=1;
			if(line.charAt(ctr) == ' ') {
				continue;
			}
			for(int ctr1=ctr+1; ctr1<line.length(); ctr1++) {
				if(line.charAt(ctr) == line.charAt(ctr1)) {
					count++;
				}
			}
			countChar.putIfAbsent(line.charAt(ctr),count);
		}
		System.out.println(countChar.keySet()+"="+countChar.values()+",");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the line you want to count the characters");
		String str = scan.nextLine();
		toCountOccurance(str);
		scan.close();
	}

}
