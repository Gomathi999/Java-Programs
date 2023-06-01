package assignment;

import java.util.Scanner;

public class MatrixOperation {

	private static final Scanner scan = new Scanner(System.in);

	public static void toGetMatrixElements(int arr[][]) {
		System.out.println("Enter the elements");
		for(int row=0;row < arr.length; row++ ) {
			for(int col = 0; col < arr[row].length; col++) {
				arr[row][col] = scan.nextInt();
			}
		}
	}

	
	private static void doAddition(int[][] arr1, int[][] arr2) {
		int arr3[][] = new int[arr1.length][arr1.length];
		for(int row=0;row < arr1.length; row++ ) {
			for(int col = 0; col < arr1[row].length; col++) {
				arr3[row][col] = arr1[row][col] + arr2[row][col];
			}
		}
		display(arr3);
	}

	private static void doSubtraction(int[][] arr1, int[][] arr2) {
		int arr3[][] = new int[arr1.length][arr1.length];
		for(int row=0;row < arr1.length; row++ ) {
			for(int col = 0; col < arr1[row].length; col++) {
				arr3[row][col] = arr1[row][col] - arr2[row][col];
			}
		}
		display(arr3);
	}

	private static void doDivision(int[][] arr1, int[][] arr2) {
		int arr3[][] = new int[arr1.length][arr1.length];
		for(int row=0;row < arr1.length; row++ ) {
			for(int col = 0; col < arr1[row].length; col++) {
				try {
					arr3[row][col] = arr1[row][col] / arr2[row][col];
				}
				catch(ArithmeticException arithExc) {
					System.out.println(arithExc);
				}
			}
		}
		display(arr3);
	}

	private static void doMultiplication(int[][] arr1, int[][] arr2) {
		int arr3[][] = new int[arr1.length][arr1.length];
		for(int row = 0; row < arr1.length; row++){
			for(int col = 0 ; col < arr1[row].length; col++){
				for(int ctr = 0; ctr < arr1[ctr].length; ctr++){
					arr3[row][col] += arr1[row][ctr] * arr2[ctr][col];
				}
			}
		}
		display(arr3);
	}

	private static void display(int[][] arr3) {
		System.out.println("==============================");
		for(int row=0;row < arr3.length; row++ ) {
			for(int col = 0; col < arr3[row].length; col++) {
				System.out.print(arr3[row][col]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		int row , column;
		row = scan.nextInt();
		column = scan.nextInt();
		if(row == column) {
			int arr1[][] = new int [row][column];
			int arr2[][] = new int [row][column];
			toGetMatrixElements(arr1);
			toGetMatrixElements(arr2);
			doAddition(arr1, arr2);
			doSubtraction(arr1, arr2);
			doDivision(arr1, arr2);
			doMultiplication(arr1, arr2);
		}
		else {
			System.out.println("enter col and row with same numbers..");
		}
	}
}




