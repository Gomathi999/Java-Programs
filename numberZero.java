//2. user input and check if it is even or odd by using user defined method

package assignment;

import java.util.Scanner;

public class numberZero {
	
    static void toCheckPositiveOrNegative(int number){
    	if(number>0) {
    		System.out.println(number+" is positive number");
    	}
    	else if(number<0){
    		System.out.println(number+" is negative number");
    	}
    	else{
    		System.out.println(number+" is neither positive nor negative");
    	}

    }
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = scan.nextInt();
		toCheckPositiveOrNegative(number);
		scan.close();
	}
}
