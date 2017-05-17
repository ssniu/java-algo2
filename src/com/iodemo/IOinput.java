package com.iodemo;

import java.io.*;

public class IOinput {

	public static void main(String[] args) {
		
     File f = new File("bb.txt");
     FileInputStream fis = null;
     
     try{
    	 fis = new FileInputStream(f);
    	 
    	 byte[] bytes = new byte[1024];
    	 int n = 0;
    	 
    	 while((n = fis.read(bytes) ) != -1){
    		 String s = new String(bytes);//Convert array bytes[] to a string
    		 System.out.println(s);
    	 }
    	 
     }catch(Exception e){
    	 e.printStackTrace();
     }finally{
    	 try{
    		 fis.close();
    	 }catch(Exception e){
    		 e.printStackTrace();
    	 }
     }

	}

}
