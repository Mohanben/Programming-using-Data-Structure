/**
 * 
 */
package com.renault.pogramming_datatstructure;

import java.util.Scanner;

/**
 * @author z017954
 * 
 */
public class GCDDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int gcd = GCD(a, b);
		System.out.println(gcd);
		scanner.close();
	}

	private static int GCD(int a, int b) {
		int temp;
		if (a < b) {
			temp = a;
			a = b;
			b = temp;
		}
		while (a % b != 0) {
			temp = a % b;
			System.err.println(temp);
			a = b;
			b = temp;
		}
		return b;
	}

}
