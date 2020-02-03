package com.reddy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestClass {

	public static void main(String[] args) {



		String str=" abc d 1234567890pqr 54897";
		Pattern pattern = Pattern.compile("\\w+([0-9]+)\\w+([0-9]+)");
		Matcher matcher = pattern.matcher(str);
		for(int i = 0 ; i < matcher.groupCount(); i++) {
			matcher.find();
			System.out.println(matcher.group());
		}

		String[] strings = str.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
		
		for (String string : strings) {
			
			System.out.println(string);
		}
		double d = 5;
		System.out.println(5%2);
		System.out.println((d/2)*100);
		System.out.println(8%2);
	}

}
