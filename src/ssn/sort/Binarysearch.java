package ssn.sort;

public class Binarysearch {

	public static void main(String[] args) {
		
		Binary2 b = new Binary2();
		int[] arr = {1,3,5,7,9,0};
		int key = 3;
		int i = b.binarysearh(arr, key);
		System.out.println(i);

	}

}

class Binary2{
	
	public int binarysearh(int[] arr, int key){
		int low = 0;
		int high = arr.length - 1;
		
		
		while(low <= high){
			int middle = (low + high) / 2;
			if(key < arr[middle])
				high = middle - 1;
			else if( key == arr[middle])
				return middle;
			else 
				low = middle + 1;
		}
		return -1;
	}
}
