package com.renault.pogramming_datatstructure;

/**
 * @author z017954
 * 
 */
public class SwapingVarible {

	public static void main(String[] args) {
		getSwappingUsingTemp();
		getSwappingNumner();
		getSwappingVaribale();
	}

	private static void getSwappingVaribale() {
		String a = "Mohan";
		String b = "Chandrasekar";
		System.out.println("***************SwappingVaribale**************************\n");
		System.out.println("BeforeSwapping " + a +"******** "+ b);
		a = a + b; //MohanChandrasekar
		b = a.substring(0, (a.length() - b.length())); //Mohan
		a = a.substring(b.length());
		System.out.println("*****************************************\n");
		System.out.println("AfterSwapping " + a +"******** "+ b);
		
	}

	private static void getSwappingUsingTemp() {
		String firatName = "Chandrasekar";
		String lastName = "Mohan";
		String temp = "";
		System.out.println("*******************SwappingUsingTemp**********************\n");
		System.out.println("Before Swapping===" + firatName + "******\t" + lastName);
		temp = firatName;
		firatName = lastName;
		lastName = temp;
		System.out.println("*****************************************\n");
		System.out.println("After Swapping===" + firatName + "******\t" + lastName);
	}

	private static void getSwappingNumner() {
		int i = 11000;
		int j = 2000;
		System.out.println("******************SwappingNumner***********************\n");
		System.out.println("Before Swapping===" + i + "******\t" + j);
		i = i + j;
		j = i - j;
		i = i - j;
		System.out.println("*****************************************\n");
		System.out.println("After Swapping===" + i + "******\t" + j);

	}

}
