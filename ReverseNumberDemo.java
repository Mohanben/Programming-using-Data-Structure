package com.renault.pogramming_datatstructure;

import java.util.Scanner;

/**
 * @author z017954
 * 
 */
public class ReverseNumberDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int reverseNumber = 0;
		System.out.println(number / 10);
		while (number != 0) {
			reverseNumber = reverseNumber * 10;
			reverseNumber = reverseNumber + number % 10;
			number = number / 10;
		}
		System.out.println("Reverese number" + reverseNumber);
		scanner.close();
	}

}
