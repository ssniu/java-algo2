package com.iodemo;

import java.io.*;

public class IOdemo {

	public static void main(String[] args) {
		
		//read file
		/*
		File f = new File("Desktop/aa.txt");
		System.out.println("the path of file:" + f.getAbsolutePath()
				+ "The size of file:" + f.length());
		*/
		//Create file and directory
		/*
		File f = new File("bb.txt");
		if(!f.exists()){
			try{
				f.createNewFile();
			}catch(Exception e){
				e.printStackTrace();
			}
		}else{
			System.out.println("The file exists");
		}
		//System.out.println("the path of file:" + f.getAbsolutePath());
		File f1 = new File("newdir");
		if(f1.isDirectory()){
			System.out.println("The dir exists");
		}else{
			f1.mkdir();
			System.out.println(f1.getAbsolutePath());
		}
		*/
		
		//list all files in a directory
		/*
		File f2 = new File("newdir");
		//System.out.println("the path of file:" + f2.getAbsolutePath());
		if(f2.isDirectory()){
			File lists[] = f2.listFiles();
			for(int i = 0; i < lists.length; i++){
				System.out.println("File is: " + lists[i].getName());
			}
		}*/
	}

}
