package com.multithreads;

public class LinearSearchDemo {

	public static void main(String[] args){
		
	
     int[] arr = {9, 3, 6, 4, 12, 15};
   
  
     int m = 15;
   
     System.out.println(linearSearch(arr,m));

 }
	
	public static int linearSearch(int[] arr, int m){
		
		for(int i = 0; i < arr.length; i++){
			   if(arr[i] == m)
				  return i;
			   
		}
		   
		return -1;
	}
}
