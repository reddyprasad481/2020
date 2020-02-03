package reddy.prasad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Numarology {

	public static void main(String[] args) {

		String inputString = "";
		do {
			Scanner input = new Scanner(System.in);
			inputString = input.nextLine();
			//System.out.println(inputString);

			if(!inputString.equalsIgnoreCase("C")){

				System.out.println(inputString);
				if(inputString != null){

					List<Integer> nameNumbersList = getNumarologyNameNumbersList(inputString);
					printNumarologyNumbers(inputString,nameNumbersList);
					printVowelsAndConsonants(inputString);
				}
			}

		} while (!inputString.equalsIgnoreCase("C"));//Close Execution
	}

	private static void printVowelsAndConsonants(String inputString) {
		
		List<String> vowelsList =Arrays.asList("a","e","i","o","u");
		List<String> allVowelsList =new ArrayList<String>();
		List<String> allConsonantsList =new ArrayList<String>();
		
		String loweCaseString = inputString.toLowerCase();

		for (int i = 0; i < inputString.length(); i++){
			String charVal = loweCaseString.charAt(i)+"";        

			if(!charVal.equalsIgnoreCase(" ")){
				
				if(vowelsList.contains(charVal)){
					
					allVowelsList.add(charVal);
				}else{
					
					allConsonantsList.add(charVal);
				}
			}

		}
	
		int sum = 0;
		System.out.print("VOWELS: ");
		for (String string : allVowelsList) {
			
			int numarologyNumber = getEquivalentNumarologyNumber(string.charAt(0));
			System.out.print(string+"-");
			System.out.print(numarologyNumber);
			System.out.print(", ");
			
			sum+=numarologyNumber;
		}
		System.out.print(" = "+sum);
		printNumerologySum(sum);
			
		System.out.println();
		System.out.print("CONSONANTS: ");
		sum = 0;
		for (String string : allConsonantsList) {
			
			int numarologyNumber = getEquivalentNumarologyNumber(string.charAt(0));
			System.out.print(string+"-");
			System.out.print(numarologyNumber);
			System.out.print(", ");
			
			sum+=numarologyNumber;
		}
	
		System.out.print(" = "+sum);
		printNumerologySum(sum);
		
		
	}

	private static void printNumerologySum(int sum) {
		while(sum>9){
			
			if(sum ==11 ||sum ==22 ||sum ==33 ||sum ==44 ){
				break;
			}
			 sum = getSumOfDigits(sum);
			}
			
			System.out.print(" --> ");
			System.out.print(sum);
	}
	
	private static void printNumarologyNumbers(String inputString, List<Integer> nameNumbersList) {

		for (int i = 0; i < inputString.length(); i++){
			char charVal = inputString.charAt(i);   


			String alphaValue = charVal+"";
			if(alphaValue !=" "){

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

		if(charInput !=" "){

			Integer intVal = null;
			try {
				
				intVal = new Integer(charInput);;
			} catch (Exception e) {
				// TODO: handle exception
			}
			if(intVal != null){

				returnVal = intVal;
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
	
	private static int getSumOfDigits(int num) {
		
		int sum = 0;
		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		
		return sum;
	}
}
