/**
 * 
 */
package com.renault.pogramming_datatstructure;

import java.util.Scanner;

/**
 * @author z017954
 * 
 */
public class FindMaximum {
	private static int[] numbers;
	private static int sizeOfArray = 0;
	private static int maxValue = 0;

	public static void main(String[] args) {
		Scanner mScanner = new Scanner(System.in);
		System.out.println("Enter the number of Array");
		sizeOfArray = mScanner.nextInt();
		numbers = new int[sizeOfArray];
		for (int i = 0; i < sizeOfArray - 1; i++) {
			numbers[i] = mScanner.nextInt();
		}
		for (int mI = 0; mI < sizeOfArray - 1; mI++) {
			int temp = 0;
			if (numbers[mI] > numbers[mI + 1]) {
				temp = numbers[mI];
				numbers[mI] = numbers[mI + 1];
				numbers[mI + 1] = temp;
			} else {
				temp = numbers[mI + 1];
				numbers[mI + 1] = numbers[mI];
				numbers[mI] = temp;
			}

		}
		System.out.println("Max Value = " + numbers[sizeOfArray - 1]);

		mScanner.close();
	}

}
