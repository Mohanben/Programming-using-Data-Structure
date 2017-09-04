package com.renault.pogramming_datatstructure;

public class FindMaxNumberDemo {
	private static int[] arrays = { 90, 50, 70, 80, 60 };
	private static int max = 0;

	public static void main(String[] args) {
		int size = arrays.length;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arrays[i] > arrays[j]) {
					max = arrays[i];
					System.err.println(arrays[i] + "**********" + arrays[j]
							+ "Max=" + max);
				} else {
					max = arrays[j];
					System.err.println(arrays[i] + "**********" + arrays[j]
							+ "Max=" + max);
				}
			}
		}
		System.out.println(max);
	}

}
