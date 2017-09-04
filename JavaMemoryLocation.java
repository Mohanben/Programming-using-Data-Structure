package com.renault.pogramming_datatstructure;


public class JavaMemoryLocation {
	public static void main(String[] args) {
		System.out.println(System.identityHashCode(new Object()));
		String string = new String("new");
		System.out.println(string.hashCode());
		System.out.println(System.identityHashCode(string));
		System.out.println(Integer.toHexString(string.hashCode()));
	}

}
