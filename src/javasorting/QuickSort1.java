package javasorting;


import java.util.Arrays;



public class QuickSort1 {
	
	public static void main(String[] args){
		int array[] = {1,12,5,26,7,14,3,7,2};
		quickSort(array, 0, array.length);
		System.out.print(Arrays.toString(array));
	}
	
	 
	 public static int partition(int arr[], int left, int right)
	 {
	       int i = left, j = right;
	       int tmp;
	       int pivot = arr[(left + right) / 2];
	      
	       while (i <= j) {
	             while (arr[i] < pivot)
	                   i++;
	             while (arr[j] > pivot)
	                   j--;
	             if (i <= j) {
	                   tmp = arr[i];
	                   arr[i] = arr[j];
	                   arr[j] = tmp;
	                   i++;
	                   j--;
	             }
	       };
	      
	       return i;
	 }
	  
	 public static void quickSort(int arr[], int left, int right) {
	       int index = partition(arr, left, right);
	       if (left < index)
	             quickSort(arr, left, index - 1);
	       if (index < right)
	             quickSort(arr, index, right);
	 }
	}
	