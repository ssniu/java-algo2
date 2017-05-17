package interviewtest;

public class Pyramid {

	public static void main(String[] args) {
		int n = 7;
		Test test = new Test();
		test.show(n);
		Test1 ts1 = new Test1();
		ts1.show1(n);
		Test3 ts3 = new Test3();
		ts3.show03(n);
	}

}

class Test{
	int n;
	
	public void show(int n){
		for(int row = 1; row <= n; row++){
			for(int sp = n - row; sp >= 0; sp--)
				System.out.print("  ");
			for(int des = row; des >= 1; des--)
				System.out.print(des + " ");
			for(int asc = 2; asc <= row ; asc++)
				System.out.print(asc + " ");
			System.out.println();
		}
	}
}

class Test1{
	int n;
	public void show1(int n){
		for(int row = 1; row <= n; row++){
			//for(int i = 1; i <= n - row + 1; i++)
			for(int i = row; i >= 1; i--)
				System.out.print(i + " ");
			System.out.println();
		}
	}
}

class Test3{
	int line;
	
	public void show03(int line){
		/*for(int row = 1; row <= n; row++){
			for(int sp = n - row;sp > 0; sp--)
				System.out.print("  ");		
			for(int desc = row; desc >= 1; desc--){
				desc *= 2;
				System.out.print(desc + " ");
			}
				
			for(int asc = 1; asc <= n; asc++){
				asc *= 2;
				System.out.print(asc + " ");
			}
				
			System.out.println();
		}*/
		for(int i = 1; i <= line; i++){

		       //Generate spaces
		       for(int j = line - i; j > 0; j--)
		         System.out.print("  ");
		       for(int k = i; k >= 2; k--) {
		             k *= 2;
		         System.out.print(k + " ");
		       }
		       for(int m = 1; m <= i; m++){
		         m *= 2;
		         System.out.print(m * 2 + " ");
		       }
		      System.out.println();
		     }
	}
}