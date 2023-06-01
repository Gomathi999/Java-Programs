// 33.Fibonacci series

package assignment;

import java.util.Scanner;

public class Fibonacci {
	
	static void toSeeFibonacciSeries(int size,int num1,int num2) {
		System.out.println("The Fibonacci series are");
		System.out.print(num1+" "+num2);
		for(int ctr=2; ctr<size; ctr++) {
			int total = num1+num2;
			System.out.print(" "+total);
			num1=num2;
			num2=total;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the limit to see fibonacci series");
		int size = scan.nextInt();
		System.out.println("Enter the number1");
		int num1 = scan.nextInt();
		System.out.println("Enter the number2");
		int num2 = scan.nextInt();
		toSeeFibonacciSeries(size,num1,num2);
		scan.close();
	}

}
