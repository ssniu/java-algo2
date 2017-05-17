package com.iodemo;

import java.io.File;
import java.io.FileOutputStream;

public class Demo03 implements BBB {

	public static void main(String[] args) {
		File f = new File("bb.txt");
		FileOutputStream fos = null;
		
		try{
			fos = new FileOutputStream(f);
			String s = "Input from java";
			//Convert string to byte array
			byte[] bytes= new byte[1024];
			fos.write(s.getBytes());

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{fos.close();
			
			}catch(Exception e){
				e.printStackTrace();
			}
		}

	}

	@Override
	public void ee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bb() {
		// TODO Auto-generated method stub
		
	}

	
}

interface AAA{
	public void ee();
}

interface BBB extends AAA{
	public void bb();
}