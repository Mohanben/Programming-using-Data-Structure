/**
 * 
 */
package com.renault.pogramming_datatstructure;

import java.util.Scanner;

/**
 * @author z017954
 * 
 */
public class FindMaxMin {

	/**
	 * @param args
	 */
	private static int max = 0;
	private static int min = 0;
	private static int numbers = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of value");
		int n = scanner.nextInt();
		max = scanner.nextInt();
		min = max;
		for (int i = 0; i < n - 1; i++) {
			numbers = scanner.nextInt();
			if (max < numbers) {
				max = numbers;
			} else if (min > numbers) {
				min = numbers;
			}
		}
		System.out.println("MAX - " + max + "\n" + " MIN - " + min);
		scanner.close();
	}

}
