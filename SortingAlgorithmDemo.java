package com.renault.pogramming_datatstructure;

/**
 * @author z017954
 * 
 */
public class SortingAlgorithmDemo {

	private static int[] sortingArray = { 90, 10, 80, 30, 100, 20, 60, 50, 70 };
	private static int temp = 0;

	public static void main(String[] args) {
		for (int i = 0; i < sortingArray.length; i++) {
			for (int j = i + 1; j < sortingArray.length; j++) {
				if (sortingArray[i] > sortingArray[j]) {
					temp = sortingArray[i];
					sortingArray[i] = sortingArray[j];
					sortingArray[j] = temp;
				}
			}
		}
		for (int i = 0; i < sortingArray.length; i++) {
			System.err.println(sortingArray[i]);
		}
	}

}
