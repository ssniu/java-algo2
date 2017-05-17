package javasorting;

public class BubbleTest {

	public static void main(String[] args) {
		Bubbled b = new Bubbled();
		
		int[]  arr = {10, 3, 2, 6, 8, 9};
		b.sort(arr);

		for(int i:arr)
			System.out.print(i + " ");
		System.out.println();
		
		Selection s = new Selection();
		int[]  arr1 = {10, 5, 2, 6, 8, 9};
		s.sort1(arr1);
		for(int i:arr1)
			System.out.print(i + " ");
		System.out.println();
		
		Insertion in = new Insertion();
		int[]  arr2 = {10, 13, 6, 8, 9};
		in.sort2(arr2);
		for(int i:arr2)
			System.out.print(i + " ");
		System.out.println();
		
		int[]  arr5 = {10, 20, 13, 6, 8, 9};
		Mergesort qs = new Mergesort();
		qs.mergeSort(arr5);
		for(int k:arr5)
			System.out.print(k + " ");
		System.out.println();
				
	}

}

//Switch the adjacent elements in array
class Bubbled{
	
    public int[] sort(int[] arr){
    	
    	int temp = 0;
    	for(int i = 0; i < arr.length - 1;i++){
    		
    		for(int j = 0; j < arr.length-i-1; j++){
    			if(arr[j] > arr[j+1]){
    				temp = arr[j+1];
    				arr[j+1] = arr[j];
    				arr[j] = temp;
    			}
    		}
    		
    	}
    	return arr;
    }
}


//find the smallest one and switch it with the first element
class Selection{
	
	public int[] sort1(int[] arr){
		//start the  loop
		for(int i = 0; i < arr.length -1; i++){
			int min = i;
			//find the index of smallest one 
			for(int k = i + 1; k < arr.length; k++){
				if(arr[k] < arr[min])
					min = k;
			}
		//if the smallest is not the current arr[i],swap them	
		if(min != i){
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		}
		return arr;	
	}
}

class Insertion{
	
	public int[] sort2(int[] arr){
		int temp;
		for(int i = 0; i < arr.length - 1 ; i++){
			
			for(int k = i + 1; k > 0; k--){
				if(arr[k] < arr[k-1]){
				temp = arr[k];
				arr[k] = arr[k-1];
				arr[k-1] = temp;
			}
			
		 }
		}
		return arr;
 }
}



class Mergesort{
	
	public int[] mergeSort(int[] arr){
			
		if(arr.length > 1){
			int[] fhalf = new int[arr.length / 2];
			System.arraycopy(arr,  0,  fhalf, 0, arr.length/2);
			mergeSort(fhalf);
			int shalf = arr.length - arr.length / 2;
			int[] lhalf = new int[shalf];
			
			System.arraycopy(arr, arr.length/2, lhalf, 0, shalf);
			mergeSort(lhalf);
			
			merge(fhalf,lhalf,arr);
			
		}
		return arr;
		
	}
	
	public void merge(int[] arr1, int[] arr2, int[] list){
		int l1 = 0;
		int l2 = 0;
		int l3 = 0;
		
		while(l1 < arr1.length && l2 <arr2.length){
			if(arr1[l1] < arr2[l2])
				list[l3++] = arr1[l1++];
			else
				list[l3++] = arr2[l2++];
		}
		
		while(l1 < arr1.length)
			list[l3++] = arr1[l1++];
		while(l2 < arr2.length)
			list[l3++] = arr2[l2++];
		
	}
}



