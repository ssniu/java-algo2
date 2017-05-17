package ssn.sort;

import java.util.ArrayList;

public class FizzBuzz {

	public static void main(String[] args) {
		
      FizzB fb = new FizzB();
      int n = 20;
      
      for(String i: fb.fizzbuzz(n))
    	  System.out.println(i + " ");
      
      System.out.println(fb.fizzbuzz(n).toString());
	}
}

class FizzB{
	
	public ArrayList<String> fizzbuzz(int n){
		
		ArrayList<String> al = new ArrayList<>(n);
		
		for(int i = 1; i <= n; i++){
			if(i % 3 == 0 && i % 5 == 0) al.add("FizzBuzz");
			else if(i % 3 == 0) al.add("Fizz");
			else if(i % 5 == 0) al.add("Buzz");
			//else al.add(String.valueOf(i));
			else al.add(i + " ");
		}
		return al;
	}
}