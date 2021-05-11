package com.collection;

//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class FileInputOutPutStreamExample {
//
//	public static void main(String[] args) throws IOException {
//		try {
//		File f1= new File("D:\\Test\\pallavi.txt");
//		if(f1.createNewFile()) {
//			System.out.println("file not their" +getName());
//		}
//		else {
//			System.out.println("file is their");
//		}
//		}
//		catch(Exception e) {
//			
//		}
//	
//	FileReader fr;
//	try {
//		fr = new FileReader("D://Text/Text.txt");
//		int i; 
//		while((i=fr.read())!=-1)    
//			 System.out.print((char)i);
//	} catch (FileNotFoundException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	    
//     
//  
//	}
//
//	private static String getName() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}
//import java.io.FileWriter;   // Import the FileWriter class
//
//public class FileInputOutPutStreamExample {
//  public static void main(String[] args) {
//    try {
//    	
//    	
//     FileWriter myWriter = new FileWriter("");
//    myWriter.write("Files in Java might be tricky, but it is fun enough!");
//     myWriter.close();
//    System.out.println("Successfully wrote to the file.");
//    } 
//    catch (Exception e) {
//      System.out.println("An error occurred.");
//      e.printStackTrace();
//    }
//  }
//}