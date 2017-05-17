package ssn.sort;

public class ArraySwap {

	public static void main(String[] args){
	Swap s = new Swap();
	
	s.swapArr();
	}
	
}


class Swap{
	int[] arr1 = {1,2,3,4,5};
	
	int[] arr2 = new int[arr1.length * 2];
	
	public void swapArr(){
	
	for(int i = 0; i < arr1.length; i++){
		arr2[i] = arr1[i];
		
	}
	arr1 = arr2;
	for(int j = 0; j < arr2.length; j++)
     System.out.println(arr2[j]);
     }
}