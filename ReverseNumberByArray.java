package com.renault.pogramming_datatstructure;

/**
 * @author z017954
 * 
 */
public class ReverseNumberByArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6 };
		int length = array.length;
		int[] newArray = new int[length];
		for (int i = length - 1; i >= 0; i--) {
			newArray[i] = array[i];
			System.out.println(newArray[i]);
		}
	}
}
