package interviewtest;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Test06 ts = new Test06();
		String str = "FOLLOW UP";
		ts.find(str);

		System.out.println();
		Tests1 ts01 = new Tests1();
		ts01.reverse1(str);
		int n = 5;
		System.out.print((n&(n-1)) == 0);
	}

}

class Test06{
	String str;
	public void find(String str){
		char ch = 0;
		for(int i = 0; i < str.length() - 1; i++)
			for(int j = 1; j < str.length(); j++){
				if(str.charAt(i) != str.charAt(j))
					System.out.print(str.charAt(i)); 
				else 
					continue;
			}
		
		}
	}
	
class Tests1{
	
	String s = "Let's take LeetCode";
	
	public void reverse1(String str){
		for(int i = str.length() - 1; i >= 0; i--){
			System.out.print(str.charAt(i));
		}
	}
}