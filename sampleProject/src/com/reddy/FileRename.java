package com.reddy;

import java.io.File;

public class FileRename {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 File folder = new File("E:\\videos\\Kathalu");
	        File[] listOfFiles = folder.listFiles();

	        for (int i = 0; i < listOfFiles.length; i++) {

	            if (listOfFiles[i].isFile()) {

	                String fileName = listOfFiles[i].getName();
	                
	                boolean isRename = isFileNameStartsWithOutAlpha(fileName);
	                
	                if(isRename){
	                	
	                	String newName = removeLeadingNonAlpha(fileName);
	                	
	                	File f = new File("E:\\videos\\Kathalu\\"+fileName); 
	                	
	                	f.renameTo(new File("E:\\videos\\Kathalu\\"+newName+".pdf"));
	                }
	            }
	        }

	        System.out.println("conversion is done");

	}

	private static String removeLeadingNonAlpha(String fileName) {
		
		
		for (int j = 0; j < fileName.length(); j++) {
			
			if(fileName.charAt(j) >= 'a'&&  fileName.charAt(j) <= 'z'){
	    		
	    		return fileName.substring(j);
	    	}
		}
			return fileName;
	}

	private static boolean isFileNameStartsWithOutAlpha(String fileName) {
		
		char c= fileName.toLowerCase().charAt(0);
		if( c >= 'a' && c <= 'z' ){
			
			return false;
		}
		
		return true;
	}

}
