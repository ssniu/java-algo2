package com.multithreads;
import java.util.*;


public class Select {

	public static void main(String[] args){
		String s ="00:01:07,400-234-090 00:05:01,701-080-080 00:05:00,400-234-090";
		
		Billpay b = new Billpay();
		b.total(s);
		
	}
}

class Billpay{
	String s;
	
	public void total(String s){
		String[] parts = s.split(" ");
		
		for(int x = 0; x < parts.length; x++)
			System.out.println(parts[x]);
		
		String[][] pars03 = new String[3][2];
		String[] time = new String[3];
		
		for(int j = 0; j < pars03.length; j++){
			for(int m = 0; m < pars03[0].length; m++){
			pars03[j] = parts[j].split(",");
			System.out.println(pars03[j][m] + " ");	
			//String[] time= pars03[j][0];
		}
			
		}
		
	}
	
	
	
}