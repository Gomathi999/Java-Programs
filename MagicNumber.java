package assignment;

import java.util.Scanner;

public class MagicNumber {
	static int sum=0; 
	static int count=0;
	static int temp;

	static void toCheckMagicNumber(int num) {
		while(num>0) {
			int rem=num%10;
			num=num/10;
			sum=sum+rem;
			temp=sum;
		}
	}
	
	static void toCountDigits() {
		while(sum>0) {
			count++;
			sum=sum/10;
		}
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number you want to check whether the number is magic number or not");
		int num = scan.nextInt();
		int input=num;
		toCheckMagicNumber(num);
		toCountDigits();
		if(count>1) {
			num=temp;
			toCheckMagicNumber(num);
			toCountDigits();
		}
		if(temp == 1) {
			System.out.println(input+" is Magic Number");
		}
		else {
			System.out.println(input+" is not Magic Number");
		}
		scan.close();
	}
}
