package com.reddy.main;

import java.util.ArrayList;
import java.util.List;

public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Test1 test1 = new Test1();
		
		
		test1.runMethod();

	}

	private static void dosomething(List<String> strings) {
		
		strings = null;
		
	}

}
