/**
 * 
 */
package com.renault.pogramming_datatstructure;

import java.util.Scanner;

/**
 * @author z017954
 * 
 */
public class FucntionDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		System.out.println("Befor call " + a + " --- " + b + " --- " + c);
		func(a, b, c);
		System.out.println("After function call " + a + " --- " + b + " --- "
				+ c);
		scanner.close();

	}

	private static void func(int a, int b, int c) {
		a = 10;
		b = 20;
		c = 30;
		System.out.println("Inside function call " + a + " --- " + b + " --- "
				+ c);
	}

}
