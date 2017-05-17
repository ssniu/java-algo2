
public class AddDigits {

	public static void main(String[] args) {
		AddDigit a = new AddDigit();
		
		System.out.println(a.add(213));

	}

}

class AddDigit{
	
	public int add(int i){
		int result = 0;
		while(i != 0){
			 result += i % 10;
			i = i / 10;
		}	
		return result;
	}
}