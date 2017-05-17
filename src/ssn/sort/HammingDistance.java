/**
 *  The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 *
 *  Given two integers x and y, calculate the Hamming distance.
 */

package ssn.sort;

import java.util.Scanner;

public class HammingDistance {
  public static void main(String[] args){
	  Scanner input = new Scanner(System.in);
	  System.out.println("Please enter two integers:");
	  
	  try{
		  int i = input.nextInt();
		  int j = input.nextInt();
		  System.out.println("The hamming distance of " + i + " and " + j
				  + " is " + hammingDistance(i,j));  
	  }catch(Exception ex){
		  ex.printStackTrace();
	  }
  }
	  // bitCount(): return the number of one-bits in the two's complement binary representation
  // of the specified int value
  //Integer.toBinaryString(): convert the decimal to binary string
	  public static int hammingDistance(int i, int j){
		  return Integer.bitCount(i ^ j);
	  }
  }

