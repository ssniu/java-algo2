package javalang;

import java.util.Scanner;

public class Paramid {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		
		System.out.println("Enter a number that between 1 and 15: ");
		int m1 = input.nextInt();
		System.out.println("Enter a number that between 1 and 15: ");
		int m2 = input.nextInt();
		
		Para p = new Para();
		p.paraMethod(m1);
		p.method02(m2);
	}
	
		
		

}

class Para{
	
   public  void paraMethod(int n){
	for(int i = 1; i <= n; i++){
		for(int j = n-i; j>0; j--){
			System.out.print("   ");
		}
		for(int k = i; k >= 1; k--){
			System.out.printf("%3d",k);
		}
		for(int m = 2; m <= i ; m++){
			System.out.printf("%3d", m);
		}
		System.out.println();
	}
 }
   
   public void  method02(int n){
	   for(int i = 1; i <= n; i++){
			for(int j = n-i; j>0; j--){
				System.out.print("   ");
			}
			for(int k = 1; k <= i; k++){	
				int k1 = (int) Math.pow(2,(k-1));
				System.out.printf("%3d",k1);
				
			}
			for(int m = i-1; m >= 1 ; m--){
				int m1 = (int) Math.pow(2,(m-1));
				System.out.printf("%3d",m1);
				
			}
			System.out.println();
		}
   }
	
}
