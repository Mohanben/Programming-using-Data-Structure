package com.renault.pogramming_datatstructure;

import java.util.Scanner;

/**
 * @author z017954
 * 
 */
public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int result = Factorial(input);
		System.out.println(result);
		scanner.close();
	}

	private static int Factorial(int input) {
		int m = 1;
		if (input < 0) {
			return 0;
		} else if (input > 0) {
			m = input * Factorial(input - 1);
		}
		return m;
	}

}
