package com.iodemo;

import java.io.*;

public class DemoStringInput {

	public static void main(String[] args) {
		
		//read the string object from file
		FileReader fr = null;
		//Write the string object to file
		FileWriter fw = null;
		
		try{
			fr = new FileReader("/Users/sniu/Desktop/aa.txt");
			char[] ch = new char[1024];// char has 2 bytes, used in file class
			int n = 0;
			
			while((n =fr.read(ch)) != -1){
				String s = new String(ch,0,n);
				System.out.println(ch);
			}
			
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}

}
