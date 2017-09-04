package com.renault.pogramming_datatstructure;

import java.util.Scanner;

/**
 * @author z017954
 * 
 */
public class FibonacciNumberDemo {
	private static int m = 0, k = 0, l = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int fibo = fibonacciNumber(n);
		System.out.println(fibo);
		scanner.close();
	}

	private static int fibonacciNumber(int n) {
		if (n < 0) {
			return n;
		} else {
			m = fibonacciNumber(n + 1);
			k = fibonacciNumber(n + 2);
			l = m + k;
		}
		return m;
	}
}
