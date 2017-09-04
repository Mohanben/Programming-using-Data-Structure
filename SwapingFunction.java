/**
 * 
 */
package com.renault.pogramming_datatstructure;

import java.util.Scanner;

/**
 * @author z017954
 * 
 */
public class SwapingFunction {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		swap(a, b, c);
		Swap swap = new Swap();
		swap.swap(swap);
		scanner.close();
	} 

	private static void swap(int a, int b, int c) {
		System.out.println("Befor call Swap" + a + " -- " + b + " -- " + c);
		int temp = 0;
		temp = a;
		a = b;
		b = c;
		c = temp;
		System.out.println("After call Swap" + a + " -- " + b + " -- " + c);
	}

}

class Swap {
	int a = 10, b = 20, c = 30;

	public void swap(Swap swap) {
		int temp = 0;
		System.out.println("Swap call before call" + swap.a + " -- " + swap.b
				+ " -- " + swap.c);
		temp = swap.a;
		swap.a = swap.b;
		swap.b = swap.c;
		swap.c = temp;
		System.out.println("Swap call after call" + swap.a + " -- " + swap.b
				+ " -- " + swap.c);
	}
}
