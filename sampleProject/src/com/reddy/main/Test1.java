package com.reddy.main;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public void makeNull(List<String> strings) {
		
		strings =null;
	}
	
	public void runMethod() {

		List<String> strings =getList();


	//	makeNull(strings);

		if(strings != null)
			try {

				System.out.println(strings);

				for (String string : strings) {

					System.out.println(string);
				}


			} catch (Exception e) {

				e.printStackTrace();
			}
	}
	public List<String> getList() {

		List<String> strings = new ArrayList<String>();

		strings.add("reddy");
		strings.add("Prasad");
		
		return null;

	}
}
