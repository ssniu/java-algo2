package ssn.sort;

import java.util.*;

public class Sumof2Darray {

	public static void main(String[] args) {
		//char ch = 50;
	    int m = 2;
		float n = m;
		System.out.println(n);
		/*int[][] m = getArray();
		System.out.println("\nSum of the array is " + sum(m));
		char ch = 65;
		System.out.println(ch);
	}
	
	public static int[][] getArray(){
		Scanner input = new Scanner(System.in);
		int[][] m = new int[3][4];
		
		for(int i = 0; i < m.length; i++)
	}*/
		int[] list = {2,3,2,5,6,1, -2, 3, 14, 12};
		quickSort(list);
		for(int i = 0; i < list.length; i++)
			System.out.print(list[i] + " ");
	}
	public static void quickSort(int[] list){
		quickSort(list, 0, list.length - 1);
	}
	
	public static void quickSort(int[] list, int first, int last){
		if(last > first){
			int pivotIndex = partition(list, first, last);
			quickSort(list, first, pivotIndex - 1);
			quickSort(list, pivotIndex + 1, last);
		}
	}
	
	public static int partition(int[] list, int first, int last){
		int pivot = list[first];
		int low = first + 1;
		int high = last;
		
		while(high > low){
			while(low <= high && list[low] <= pivot)
				low++;
			
			while(low <= high && list[high] > pivot)
				high--;
			
			if(high > low){
				int temp = list[high];
				list[high] = list[low];
				list[low] = temp;
			}
		}
		
		while(high > first && list[high] >= pivot)
			high--;
		
		if(pivot > list[high]){
			list[first] = list[high];
			list[high] = pivot;
			return high;
		}
		else {
			return first;
		}
	}

}
