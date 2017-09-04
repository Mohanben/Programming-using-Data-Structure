package com.renault.pogramming_datatstructure;

/**
 * @author z017954
 * 
 */
public class ReverseNumberByReusableArray {

	private static int temp = 0;

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6 };
		int length = array.length - 1;
		int k = length;
		int l = length;
		int t = 0;
		for (int i = 0; i <= length; i++) {
			System.out.println(t++);
			temp = array[i];
			array[i] = array[k--];
			array[l--] = temp;

		}

		for (int i = 0; i < array.length; i++) {
			// System.out.println(array[i]);
		}
	}

}
