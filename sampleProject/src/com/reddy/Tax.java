package com.reddy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Tax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String length;
		try {
			System.out.println("enter 0 to exit");
			System.out.println("enter amount to cal savings");
			length = br.readLine();
			int amount = Integer.parseInt(length);
			
			while(amount>0){
				
				calculateSavings(amount);
				
				
				System.out.println("enter 0 to exit");
				System.out.println("enter amount to cal savings");
				length = br.readLine();
				amount = Integer.parseInt(length);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}

	private static void calculateSavings(int amount) {

		float oldTax = getOldTax(amount);
		float newTax = getNewTax(amount);
		
		float difInTax = oldTax - newTax;
		System.out.println("Old:"+oldTax);
		System.out.println("New:"+newTax);
		System.out.println("Diff:"+difInTax);
	}

	private static float getNewTax(int amount) {
		
		float tax = 0;
		
		if(amount>SLAB_5L){
			
			if(amount>=SLAB_15L){

				tax += (amount -SLAB_15L)*(0.3)+(SLAB_2_5L*0.25)+(SLAB_2_5L*0.2)+(SLAB_2_5L*0.15)+(SLAB_2_5L*0.1)+(SLAB_2_5L*0.05);
				
			}else if(amount>=SLAB_12_5L){

				tax += (amount -SLAB_12_5L)*(0.25)+(SLAB_2_5L*0.2)+(SLAB_2_5L*0.15)+(SLAB_2_5L*0.1)+(SLAB_2_5L*0.05);
			}else if(amount>=SLAB_10L){

				tax += (amount -SLAB_10L)*(0.2)+(SLAB_2_5L*0.15)+(SLAB_2_5L*0.1)+(SLAB_2_5L*0.05);
			}else if(amount>=SLAB_7_5L){

				tax += (amount -SLAB_7_5L)*(0.15)+(SLAB_2_5L*0.1)+(SLAB_2_5L*0.05);
			}else if(amount>=SLAB_5L){

				tax += (amount -SLAB_5L)*(0.1)+(SLAB_2_5L*0.05);
			}
		}
		return tax;
	}

	private static float getOldTax(int amount) {

		float tax = 0;

		if(amount>SLAB_5L){

			if(amount>=SLAB_10L){

				tax += (amount -SLAB_10L)*(0.3)+(SLAB_5L*0.2)+(SLAB_2_5L*0.05);
				
			}else if(amount>=SLAB_5L){

				tax += (amount -SLAB_5L)*(0.2)+(SLAB_2_5L*0.05);
			}


		}
		return tax;
	}

	private static final int SLAB_2_5L = 250000;
	private static final int SLAB_5L = 500000;
	private static final int SLAB_7_5L = 750000;
	private static final int SLAB_10L = 1000000;
	private static final int SLAB_12_5L = 1250000;
	private static final int SLAB_15L = 1500000;
}
