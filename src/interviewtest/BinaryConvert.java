package interviewtest;

public class BinaryConvert {

	public static void main(String[] args) {
		int i = 11;
		Test04 ts = new Test04();
		ts.printBinary(i);
		Test05 ts1 = new Test05();
		ts1.printBinary(i);
		int[] arr={8, 2, 9, 1, 3, 8, 8, 8, 8, 8};
		Occurence oc = new Occurence();
		System.out.println(oc.calculate(arr));

	}

}

class Test04{
	int i;
	public void printBinary(int i){
		String str = "";
		for(int j = i; j > 0; j/=2)
			str = j % 2 + str;
		System.out.println(str);
	}
}

class Test05{
	int i;
	public void printBinary(int i){
		String str = "";
		for(int j = i; j > 0; j/=8)
			str = j % 8 + str;
		System.out.println(str);
	}
}

class Occurence{
	int[] arr = new int[10];
	
	
	public int calculate(int[] arr){
		int max = arr[0];
		int count = 1;
		
		for(int i = 1; i < arr.length; i++){
			if(arr[i] == max) {
				count++;
			}
			if(arr[i] > max) {
				count = 1;
				max = arr[i];
			}
		}
		return count;
	}
	
	/*public int getFirstSecond(int[] arr){
		int max = arr[0];
		int secondMax = arr[1];
		int countMax = 1;
		int countSecondMax = 1;
		
		for(int i = 1; i < arr.length; i++){
			if(arr[i] == max) {
				count++;
			}
			if(arr[i] > max) {
				count = 1;
				max = arr[i];
			}
		}
		return count;
	}*/
	
}

