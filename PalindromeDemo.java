/**
 * 
 */
package com.renault.pogramming_datatstructure;

import java.util.Scanner;

/**
 * @author z017954
 * 
 */
public class PalindromeDemo {
	private static String reverese = "";

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		for (int i = string.length() - 1; i >= 0; i--) {
			reverese = reverese + string.charAt(i);
		}
		// System.out.println(reverese);
		if (string.equals(reverese)) {
			System.out.println("String are equals = " + reverese);
		} else {
			System.out.println("String are not equals = " + reverese);
		}
		scanner.close();
	}
}
