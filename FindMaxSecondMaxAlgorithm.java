/**
 * 
 */
package com.renault.pogramming_datatstructure;

import java.util.Scanner;

/**
 * @author z017954
 * 
 */
public class FindMaxSecondMaxAlgorithm {

	private static int[] tournmenet;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of Elements");
		int elements = scanner.nextInt();
		tournmenet = new int[2 * elements - 1];
		System.out.println("Size = " + tournmenet.length);
		for (int i = elements - 1; i < tournmenet.length; i++) {
			tournmenet[i] = scanner.nextInt();
			// System.out.println(tournmenet[i]);
		}
		for (int i = 2 * elements - 3; i > 1; i = i - 2) {
			tournmenet[i / 2] = findMax(tournmenet[i], tournmenet[i + 1]);
		}
		for (int i = 0; i < tournmenet.length; i++) {
			System.out.println(tournmenet[i]);
		}
		scanner.close();
	}

	private static int findMax(int i, int j) {
		if (i > j) {
			return i;
		} else {
			return j;
		}
	}

}
