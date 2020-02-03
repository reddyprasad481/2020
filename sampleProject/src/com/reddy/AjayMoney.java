package com.reddy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
class AjayMoney
{

public static void main(String[] args) {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String length;
	try {
		System.out.println("enter lngth");
		length = br.readLine();
		System.out.println(length);
		int listLength = Integer.parseInt(length);
		System.out.println(listLength);
		//int numbers[] = new int[10000];2
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i=0; i<listLength; i++)
		{
			System.out.println("enter number");
			String temp = br.readLine();
			numbers.add(Integer.parseInt(temp));
		}
		for(int i=0; i<numbers.size(); i++)
		{
			System.out.println(numbers.get(i));
			
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}