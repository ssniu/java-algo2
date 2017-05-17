package com.iodemo;


import java.io.*;

public class IOimage{

	public static void main(String[] args) {
		//read the image in memory, then write it to a file
		//File f1 = new File("Desktop/2017.png");
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try{
			fis = new FileInputStream("2017.png");
			fos = new FileOutputStream("2018.png");
			
			//System.out.println(fis.getFD());
			byte[] buf = new byte[512];
			
			int n=0;
			while((n = fis.read(buf)) != -1){
				fos.write(buf);
			}
		}
			catch(Exception e){
				e.printStackTrace();
			}finally{
				
				try{
			
				fis.close();
				fos.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		
			}
	
	}
}



