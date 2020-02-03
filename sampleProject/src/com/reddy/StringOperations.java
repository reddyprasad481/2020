package com.reddy;

public class StringOperations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String inputString = "ECForm -/P//NIC//paaf383169///T";
		String compareString="paaf383169";
		String compareString1=compareString.toUpperCase();
		String outputString = null;
		System.out.println(inputString);
		//compareString = compareString.to
		outputString = inputString.replace(compareString, compareString1);
		//inputString.replaceAll(regex, replacement)
		inputString.replace(compareString, compareString1);
		//System.out.println(outputString);
		
		System.out.println(inputString.replace(compareString, compareString1));
		System.out.println(inputString);
		System.out.println(inputString.replaceAll(compareString, compareString1));
		System.out.println(inputString.replaceFirst(compareString, compareString1));
		
	}

}
