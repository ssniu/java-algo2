package com.multithreads;

public class Bubblesort {

	public static void main(String[] args) {
		int[] arr = {15, 4, 45, 33, 9, 21, 8};
		
		int temp = 0;
		
		for(int i = 0; i < arr.length- 1; i++){
			for(int j = 1; j < arr.length; j++){
				if(arr[j - 1] > arr[j]){
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int m:arr){
			System.out.print(m + " ");
		}

	}

}
