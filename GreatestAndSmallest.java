package assignment;

import java.util.Scanner;

public class GreatestAndSmallest {

	public static void toFindSmallest(int num1, int num2, int num3) {
		if((num1<num2) && (num1<num3)){
			System.out.println(num1+" is smallest");
		}
		else if((num2<num1) && (num2<num3)){
			System.out.println(num2+" is smallest");
		}
		else {
			System.out.println(num3+" is smallest");
		}
	}

	public static void toFindGreatest(int num1, int num2, int num3) {
		if((num1>num2) && (num1>num3)){
			System.out.println(num1+" is greatest number");
		}
		else if((num2>num1) && (num2>num3)){
			System.out.println(num2+" is greatest number");
		}
		else {
			System.out.println(num3+" is greatest number");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the 3 numbers :");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		toFindSmallest(num1, num2, num3);
		toFindGreatest(num1, num2, num3);
		scan.close();
	}

}
