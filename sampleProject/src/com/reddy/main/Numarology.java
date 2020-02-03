package com.reddy.main;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class Numarology {

	public static void main(String[] args) {

		String inputString = "";
		do {
			Scanner input = new Scanner(System.in);
			inputString = input.nextLine();
			//System.out.println(inputString);

			if(!inputString.equalsIgnoreCase("C")){

				System.out.println(inputString);
				if(StringUtils.isNotBlank(inputString)){

					List<Integer> nameNumbersList = getNumarologyNameNumbersList(inputString);
					printNumarologyNumbers(inputString,nameNumbersList);
				}
			}

		} while (!inputString.equalsIgnoreCase("C"));//Close Execution
	}

	private static void printNumarologyNumbers(String inputString, List<Integer> nameNumbersList) {

		for (int i = 0; i < inputString.length(); i++){
			char charVal = inputString.charAt(i);   


			String alphaValue = charVal+"";
			if(StringUtils.isAlphanumeric(alphaValue )){

				System.out.print(alphaValue);
			}else{

				System.out.print(" ");
				System.out.print(alphaValue);
				System.out.print(" ");
				System.out.print(" ");
			}
		
		}
		System.out.println(" ");
		System.out.println("-------------------------------------------");

		int totalNameNumarologyNumber =0;
		int wordNumarologyNumber =0;
		for (Integer alphaNumber : nameNumbersList) {

			if(alphaNumber != null){

				totalNameNumarologyNumber+=alphaNumber;
				wordNumarologyNumber+=alphaNumber;

				System.out.print(alphaNumber);
			}else{

				System.out.print(" ");
				System.out.print(wordNumarologyNumber);
				System.out.print(" ");
				wordNumarologyNumber =0;
			}
		}

		if(wordNumarologyNumber != 0){
			
			System.out.print(" ");
			System.out.print(wordNumarologyNumber);
		}

		if(totalNameNumarologyNumber != 0){

			System.out.print(" =");
			System.out.print(totalNameNumarologyNumber);
		}

		System.out.println(" ");
		System.out.println("====================================");
	}

	private static List<Integer> getNumarologyNameNumbersList(String inputString) {

		List<Integer> numarologyNameNumbersList= new ArrayList<Integer>();
		String loweCaseString = inputString.toLowerCase();

		for (int i = 0; i < inputString.length(); i++){
			char charVal = loweCaseString.charAt(i);        

			Integer nuumarologyNumber =  getEquivalentNumarologyNumber(charVal);

			numarologyNameNumbersList.add(nuumarologyNumber);
		}
		return numarologyNameNumbersList;
	}

	private static Integer getEquivalentNumarologyNumber(char charVal) {

		String charInput = charVal+"";
		Integer returnVal = null;

		if(StringUtils.isAlphanumeric(charInput)){

			if(StringUtils.isNumeric(charInput)){

				returnVal = new Integer(charInput);
			}else{//Alpha value

				int ascii = (int) charVal;//a==97

				int alphabitNumber = ascii-96;//a==1

				int numarologyNumber =  alphabitNumber%9; // reminder of 9

				if(numarologyNumber == 0)
					numarologyNumber =9;
				returnVal = new Integer(numarologyNumber);
			}
		}

		return returnVal;
	}
}
