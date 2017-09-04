package com.renault.pogramming_datatstructure;

import java.rmi.dgc.Lease;
import java.util.Scanner;

/**
 * @author z017954
 * 
 */
public class MinMaxPairWiseComparison {
	private static int[] array;
	private static int[] maxArray;
	private static int[] minArray;
	private static int length;
	private static int size;
	private static int k = 0;
	private static int l = 0;
	private static int max, min;
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Enter the size");
		size = scanner.nextInt();
		initilize();
		readValue();
		minMaxManupulation();
		max = findMax(maxArray);
		min = finMin(minArray);
		System.out.println("Max ==== " + max + " Min =====" + min);
		scanner.close();
	}

	private static void readValue() {
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
	}

	private static void minMaxManupulation() {
		for (int i = 0; i < length; i = i + 2) {
			for (int j = i + 1; j > i; j--) {
				if (array[i] > array[j]) {
					maxArray[l++] = array[i];
					minArray[k++] = array[j];
				} else {
					maxArray[l++] = array[j];
					minArray[k++] = array[i];
				}
			}
		}
	}

	private static void initilize() {
		array = new int[size];
		length = array.length;
		maxArray = new int[length / 2];
		minArray = new int[length / 2];
	}

	private static int finMin(int[] minArray) {
		int temp = 0;
		for (int i = 0; i < minArray.length - 1; i++) {
			for (int j = i + 1; j < minArray.length; j++) {
				if (minArray[i] < minArray[j]) {
					temp = minArray[i];
					minArray[i] = minArray[j];
					minArray[j] = temp;
				}
			}
		}
		return minArray[minArray.length - 1];
	}

	private static int findMax(int[] maxArray) {
		int temp = 0;
		for (int i = 0; i < maxArray.length - 1; i++) {
			for (int j = i + 1; j < maxArray.length; j++) {
				if (maxArray[i] > maxArray[j]) {
					temp = maxArray[i];
					maxArray[i] = maxArray[j];
					maxArray[j] = temp;
				}
			}
		}
		return maxArray[maxArray.length - 1];
	}

}
