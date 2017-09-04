package com.renault.pogramming_datatstructure;

import java.util.Scanner;

/**
 * @author z017954
 * 
 */
public class FindMaxAlgorithmDemo {

	private static int numberOfELements = 0;
	private static int size = 0;
	private static int[] maxArray;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number Of Elements");
		numberOfELements = scanner.nextInt();
		size = 2 * numberOfELements - 1;
		maxArray = new int[size];
		for (int i = numberOfELements; i < size; i++) {
			maxArray[i] = scanner.nextInt();
		}

		for (int i = 2 * numberOfELements - 2; i > 0; i = i - 2) {
			maxArray[(i / 2)] = findMax(maxArray[i], maxArray[i + 1]);
		}
		for (int i = 0; i < maxArray.length; i++) {
			System.out.println(maxArray[i]);
		}
		scanner.close();
	}

	private static int findMax(int i, int j) {
		if (i < j) {
			return j;
		} else {
			return i;
		}
	}

}
