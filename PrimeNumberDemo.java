/**
 * 
 */
package com.renault.pogramming_datatstructure;

import java.util.ArrayList;

/**
 * @author z017954
 * 
 */
public class PrimeNumberDemo {

	private static final int range = 10;
	private static int[] primeArray;
	private static ArrayList primeList = new ArrayList();

	public static void main(String[] args) {
		// primeArray = new int[range];
		for (int i = 1; i < range; i++) {
			for (int j = i; j >= 1; j--) {
				if (i % j == 0) {
					System.out.println("not Prime "+i);
				}
			}
		}
		for (int i = 0; i < primeList.size(); i++) {
			System.out.println("Prime Number = " + primeList.get(i));
		}
	}

}
